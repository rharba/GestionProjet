package dao1;

import static dao1.DAO.getCon;
import entiter.Jalon;
import entiter.Phase;
import entiter.Tache;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;

public class PhaseDAO {
    private Connection connection;
    private static PhaseDAO instance;

    // Constructeur privé pour empêcher l'instanciation directe depuis l'extérieur de la classe
    public PhaseDAO() {
        connection = DAO.getCon();
    }
    public void ajouterPhase(Phase phase) throws SQLException {
        String query = "INSERT INTO phase (nom) VALUES (?)";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, phase.getNom());
            pstmt.executeUpdate();
        }
    }
    public int getPhaseIdByName(String nomPhase) throws SQLException {
    int idPhase = -1; // Valeur par défaut si aucune phase n'est trouvée
    
    try (PreparedStatement pstmt = connection.prepareStatement("SELECT id_phase FROM phase WHERE nom_phase = ?")) {
        pstmt.setString(1, nomPhase);
        
        try (ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                idPhase = rs.getInt("id_phase");
            }
        }
    }
    
    return idPhase;
}
    // Méthode pour établir la connexion à la base de données
    public void openConnection() throws SQLException {
        connection = DAO.getCon();
    }
public List<String> getNomsPhases() throws SQLException {
    List<String> nomsPhases = new ArrayList<>();
    PreparedStatement statement = null;
    ResultSet resultSet = null;

    try {
        openConnection();// Assurez-vous que la connexion est ouverte
        // Préparer la requête SQL
        String query = "SELECT nom_phase FROM phase";
        statement = connection.prepareStatement(query);

        // Exécuter la requête SQL
        resultSet = statement.executeQuery();

        // Parcourir les résultats et ajouter les noms des phases à la liste
        while (resultSet.next()) {
            String nomPhase = resultSet.getString("nom_phase");
            nomsPhases.add(nomPhase);
        }
    } finally {
        // Fermer les ressources
        if (resultSet != null) {
            resultSet.close();
        }
        if (statement != null) {
            statement.close();
        }
    }

    return nomsPhases;
}

    public List<Phase> listerPhases() throws SQLException {
        List<Phase> phases = new ArrayList<>();
        String query = "SELECT * FROM phase";
        try (PreparedStatement pstmt = connection.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                Phase phase = new Phase();
                phase.setId(rs.getInt("id"));
                phase.setNom(rs.getString("nom"));
                phases.add(phase);
            }
        }
        return phases;
    }

    public void supprimerPhase(int id) throws SQLException {
        String query = "DELETE FROM phase WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        }
    }
     public void ajouterTache(Tache tache) throws SQLException {
        String query = "INSERT INTO tache (nom, description, datedebut, datefin, membre) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = DAO.getCon().prepareStatement(query)) {
            statement.setString(1, tache.getNom());
            statement.setString(2, tache.getDescription());
            statement.setDate(3, (Date) tache.getDateDebut());
            statement.setDate(4, (Date) tache.getDateFin());
            statement.setString(5, tache.getMembre());
            statement.executeUpdate();
        }
    }

    public void ajouterPhase(String Phase) throws SQLException {
        String query = "INSERT INTO phase (nom) VALUES (?)";
        try (PreparedStatement statement = DAO.getCon().prepareStatement(query)) {
            statement.setString(1, Phase);
            statement.executeUpdate();
        }
    }

    public static List<Tache> liste(String phase) throws SQLException {
        List<Tache> listeTaches = new ArrayList<>();
        String sql = "SELECT nom, description, datedebut, datefin, membre " +
                "FROM tache t " +
                "INNER JOIN phase p ON p.numphase = t.numphase " +
                "WHERE p.nom = ?";
        try (PreparedStatement stmt = DAO.getCon().prepareStatement(sql)) {
            stmt.setString(1, phase);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Tache tache = new Tache(
                            rs.getString("nom"),
                            rs.getString("description"),
                            rs.getDate("datedebut"),
                            rs.getDate("datefin"),
                            rs.getString("membre")
                    );
                    listeTaches.add(tache);
                }
            }
        }
        return listeTaches;
    }

    public JComboBox<String> remplirComboBox() throws SQLException {
        JComboBox<String> comboBox = new JComboBox<>();
        String sql = "SELECT nom FROM phase";
        try (PreparedStatement stmt = DAO.getCon().prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                String nomPhase = rs.getString("nom");
                comboBox.addItem(nomPhase);
            }
        }
        return comboBox;
    }

    public void ajouterJalon(Jalon jalon) throws SQLException {
        String query = "INSERT INTO jalon (titre, description, date) VALUES (?, ?, ?)";
        try (PreparedStatement statement = DAO.getCon().prepareStatement(query)) {
            statement.setString(1, jalon.getTitre());
            statement.setString(2, jalon.getDescription());
            statement.setDate(3, new Date(jalon.getDate().getTime()));
            statement.executeUpdate();
        }
    }

    public static List<Jalon> listeJalons() throws SQLException {
        List<Jalon> listeJalons = new ArrayList<>();
        String sql = "SELECT titre, description, date FROM jalon";
        try (PreparedStatement stmt = DAO.getCon().prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Jalon jalon = new Jalon(
                        rs.getString("titre"),
                        rs.getString("description"),
                        rs.getDate("date")
                );
                listeJalons.add(jalon);
            }
        }
        return listeJalons;
    }
}
