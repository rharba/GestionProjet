package dao1;

import entiter.Tache;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TacheDAO {

    private Connection connection;
    private static TacheDAO instance;

    // Constructeur privé pour empêcher l'instanciation directe depuis l'extérieur de la classe
    public TacheDAO() {
        connection = DAO.getCon();
    }

    public List<Tache> listerTaches(int idPhase) throws SQLException {
        List<Tache> listeTaches = new ArrayList<>();
        String requete = "SELECT * FROM tache WHERE id_phase = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(requete)) {
            pstmt.setInt(1, idPhase);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    Tache tache;
                    tache = new Tache(
                            rs.getString("nom"),
                            rs.getString("description"),
                            rs.getDate("date_debut"),
                            rs.getDate("date_fin"),
                            rs.getString("duree_estimee"));
                    tache.setId(rs.getInt("id_tache"));
                    listeTaches.add(tache);
                }
            }
        }
        return listeTaches;
    }

    public void insererTache(Tache tache) throws SQLException {
        String requete = "INSERT INTO tache (nom, description, date_debut, date_fin, duree_estimee, id_membre, id_phase) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = connection.prepareStatement(requete)) {
            pstmt.setString(1, tache.getNom());
            pstmt.setString(2, tache.getDescription());
            pstmt.setDate(3, new java.sql.Date(tache.getDateDebut().getTime()));
            pstmt.setDate(4, new java.sql.Date(tache.getDateFin().getTime()));
            pstmt.setInt(5, tache.getDureeEstimee());
            pstmt.setInt(6, tache.getIdMembre());
            pstmt.setInt(7, 1);

            pstmt.executeUpdate();
        }
    }

    public void supprimerTache(int idTache) throws SQLException {
        String requete = "DELETE FROM tache WHERE id_tache = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(requete)) {
            pstmt.setInt(1, idTache);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(); // Gérez l'exception de suppression de tâche
            throw ex; // Vous pouvez choisir de lever l'exception ou de la gérer différemment
        }
    }

    public void modifierTache(Tache tache) throws SQLException {
        String requete = "UPDATE tache SET nom = ?, description = ?, date_debut = ?, date_fin = ?, duree_estimee = ?, id_membre = ? "
                + "WHERE id_tache = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(requete)) {
            pstmt.setString(1, tache.getNom());
            pstmt.setString(2, tache.getDescription());
            pstmt.setDate(3, new java.sql.Date(tache.getDateDebut().getTime()));
            pstmt.setDate(4, new java.sql.Date(tache.getDateFin().getTime()));
            pstmt.setInt(5, tache.getDureeEstimee());
            pstmt.setInt(6, tache.getIdMembre());
            pstmt.setInt(7, tache.getId());

            pstmt.executeUpdate();
        }
    }
    
}
