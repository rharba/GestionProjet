
package controler;

import dao1.PhaseDAO;
import entiter.Jalon;
import entiter.Phase;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JComboBox;


public class PhaseCtr {
     public PhaseCtr() {
  
        this.phaseDAO = new PhaseDAO();
    
    }
       private PhaseDAO phaseDAO;
        // Méthode pour récupérer la liste des noms des phases
public List<String> getListeNomsPhases() throws SQLException {
    PhaseDAO phaseDAO = new PhaseDAO();
    phaseDAO.openConnection(); // Assurez-vous d'ouvrir la connexion
    List<String> nomsPhases = phaseDAO.getNomsPhases();
    // N'oubliez pas de fermer la connexion
    return nomsPhases;
}
public int getPhaseIdByName(String nomPhase) throws SQLException {
    PhaseDAO phaseDAO = new PhaseDAO();
    phaseDAO.openConnection();
    int idPhase = phaseDAO.getPhaseIdByName(nomPhase);
    return idPhase;
}

    List<Phase> getListePhases() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void ajouterPhase(String phase) {
        try {
            phaseDAO.ajouterPhase(phase);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public JComboBox<String> remplirComboBox() {
        try {
            return phaseDAO.remplirComboBox();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void ajouterJalon(Jalon jalon) {
        try {
            phaseDAO.ajouterJalon(jalon);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void afficherListeJalons() {
        try {
            phaseDAO.listeJalons();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
