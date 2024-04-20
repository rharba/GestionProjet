package dao1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EquipeDAO {
    private Connection connection;

    // Méthode pour établir la connexion à la base de données
    public void openConnection() throws SQLException {
        connection = DAO.getCon();
    }

    // Méthode pour récupérer les noms des équipes depuis la base de données
    public List<String> getNomsEquipes() throws SQLException {
        List<String> nomsEquipes = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            openConnection(); // Assurez-vous que la connexion est ouverte
            // Préparer la requête SQL
            String query = "SELECT nom_equipe FROM equipe";
            statement = connection.prepareStatement(query);

            // Exécuter la requête SQL
            resultSet = statement.executeQuery();

            // Parcourir les résultats et ajouter les noms des équipes à la liste
            while (resultSet.next()) {
                String nomEquipe = resultSet.getString("nom_equipe");
                nomsEquipes.add(nomEquipe);
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

        return nomsEquipes;
    }
    
    public int getEquipeIdByNom(String equipeNom) throws SQLException {
        int equipeId = -1; // Initialisez l'ID de l'équipe à une valeur par défaut
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            openConnection(); // Assurez-vous que la connexion est ouverte
            String query = "SELECT id_equipe FROM equipe WHERE nom_equipe = ?";
            ps = connection.prepareStatement(query);
            ps.setString(1, equipeNom);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                equipeId = rs.getInt("id_equipe");
            }
        } finally {
            // Ne pas fermer la connexion ici pour éviter la fermeture définitive
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
        }
        
        return equipeId;
    }
}
