/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao1;


import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AvancementDAO {
    private Connection connection;


    // Constructeur privé pour empêcher l'instanciation directe depuis l'extérieur de la classe
    public AvancementDAO() {
        connection = DAO.getCon();
    }

   
    // Méthode pour récupérer les données d'avancement depuis la base de données
   public List<List<String>> listerAvancements() throws SQLException {
    List<List<String>> avancements = new ArrayList<>();
    String query = "SELECT temps_passe, temps_restant, avancement FROM avancement";
    try (PreparedStatement pstmt = connection.prepareStatement(query);
         ResultSet rs = pstmt.executeQuery()) {
        while (rs.next()) {
            List<String> avancement = new ArrayList<>();
            avancement.add(rs.getString("temps_passe"));
            avancement.add(rs.getString("temps_restant"));
            avancement.add(rs.getString("avancement"));
            avancements.add(avancement);
        }
    }
    return avancements;
}

    public void modifierAvancement(String tempsPasse, String tempsRestant, String avancement) throws SQLException {
        String query = "UPDATE avancement SET temps_passe = ?, temps_restant = ?, avancement = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, tempsPasse);
            pstmt.setString(2, tempsRestant);
            pstmt.setString(3, avancement);

            pstmt.executeUpdate();
        }
    }
}
