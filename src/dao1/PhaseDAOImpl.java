/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao1;

import entiter.Phase;
import java.util.List;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;

public class PhaseDAOImpl extends PhaseDAO {
    private Connection connection;

    public PhaseDAOImpl(Connection connection) {
        this.connection = connection;
    }

    
    @Override
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
    }