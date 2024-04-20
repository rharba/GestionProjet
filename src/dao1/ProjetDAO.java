package dao1;

import entiter.Projet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JComboBox;

public class ProjetDAO {

    private Connection connection;
    private String equipe;

    public ProjetDAO() {
        connection = DAO.getCon();
    }

    public List<Projet> listerProjets() throws SQLException {
        List<Projet> listeProjets = new ArrayList<>();
        String requete = "SELECT * FROM projet";

        try (PreparedStatement pstmt = connection.prepareStatement(requete);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                Projet projet = new Projet(
                        rs.getString("titre"),
                        rs.getString("description"),
                        rs.getString("domaine"),
                        rs.getDate("date_debut"),
                        rs.getDate("date_fin"),
                        rs.getInt("id_professeur"),
                        rs.getString("classe"),
                        rs.getString("filiere"),
                        rs.getString("type_projet"), equipe
                );
                projet.setId(rs.getInt("id_projet"));
                listeProjets.add(projet);
            }
        }
        return listeProjets;
    }

    public void insererProjet(Projet projet) throws SQLException {
        String requete = "INSERT INTO projet (titre, description, domaine, date_debut, date_fin, id_professeur, classe, filiere, type_projet) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = connection.prepareStatement(requete)) {
            pstmt.setString(1, projet.getTitre());
            pstmt.setString(2, projet.getDescription());
            pstmt.setString(3, projet.getDomaine());
            pstmt.setDate(4, new java.sql.Date(projet.getDateDebut().getTime()));
            pstmt.setDate(5, new java.sql.Date(projet.getDateFin().getTime()));
            pstmt.setInt(6, projet.getProfesseurId());
            pstmt.setString(7, projet.getClasse());
            pstmt.setString(8, projet.getFiliere());
            pstmt.setString(9, projet.getTypeProjet());

            pstmt.executeUpdate();
        }
    }

    public void supprimerProjet(int id) throws SQLException {
        String requete = "DELETE FROM projet WHERE id_projet = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(requete)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            // Gérer l'exception de suppression de projet
            ex.printStackTrace(); // À adapter en fonction de votre logique de gestion d'erreur
            throw ex; // Vous pouvez choisir de lever l'exception ou de la gérer différemment
        }
    }

    // Méthode pour mettre à jour l'équipe associée à un projet
    public void updateProjetEquipe(int projetId, int equipeId) throws SQLException {
        PreparedStatement ps = null;

        try {
            String query = "UPDATE projet SET id_equipe = ? WHERE id_projet = ?";
            ps = connection.prepareStatement(query);
            ps.setInt(1, equipeId);
            ps.setInt(2, projetId);
            ps.executeUpdate();
        } finally {
            // Fermeture des ressources
            if (ps != null) {
                ps.close();
            }
        }
    }

    public List<Projet> remplirComboBox() throws SQLException {
        List<Projet> listeProjet = new ArrayList<>();
        String sql = "SELECT titre FROM projet";
        try (PreparedStatement stmt = DAO.getCon().prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Projet p = new Projet(rs.getString("titre"));
                listeProjet.add(p);
            }
        }
        return listeProjet;
    }

    public static List<Projet> listerProjets(String phase) throws SQLException {
        List<Projet> listeProjet = new ArrayList<>();
        String sql = "SELECT \n" +
                "    p.titre AS Titre_projet,\n" +
                "    p.description AS Description_projet,\n" +
                "    p.date_debut AS Date_debut_projet,\n" +
                "    p.date_fin AS Date_fin_projet,\n" +
                "    p.equipe_etudiant AS Equipe_etudiant\n" +
                "FROM \n" +
                "    projet p\n" +
                "JOIN \n" +
                "    tache t ON p.id_projet = t.id_projet\n" +
                "JOIN \n" +
                "    avancement a ON t.id_tache = a.id_tache;";
        try (PreparedStatement stmt = DAO.getCon().prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                String titre = rs.getString("Titre_projet");
                String description = rs.getString("Description_projet");
                Date dateDebut = rs.getDate("Date_debut_projet");
                Date dateFin = rs.getDate("Date_fin_projet");
                String equipe = rs.getString("Equipe_etudiant");
                Projet projet = new Projet(titre, description, null, dateDebut, dateFin, 0, null, null, null, equipe);
                listeProjet.add(projet);
            }
        }
        return listeProjet;
    }

    public void ajouterPhase(String code, JComboBox<String> comboBox) throws SQLException {
        String query = "SELECT nom FROM phase WHERE projetcode = ?";
        try (PreparedStatement statement = DAO.getCon().prepareStatement(query)) {
            statement.setString(1, code);
            try (ResultSet resultSet = statement.executeQuery()) {
                comboBox.removeAllItems();
                while (resultSet.next()) {
                    String nomPhase = resultSet.getString("nom");
                    comboBox.addItem(nomPhase);
                }
            }
        }
    }
}
