package controler;

import dao1.EquipeDAO;
import dao1.ProjetDAO;
import entiter.Projet;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import javax.swing.JComboBox;

public class ProjetCtr {
    private ProjetDAO projetDAO;

    public ProjetCtr() {
        this.projetDAO = new ProjetDAO();
    }

    public void creerProjet(String titre, String description, String domaine, Date dateDebut, Date dateFin, int professeurId, String classe, String filiere, String typeProjet) throws SQLException {
        String equipe = null;
        Projet projet = new Projet(titre, description, domaine, dateDebut, dateFin, professeurId, classe, filiere, typeProjet, equipe);
        projetDAO.insererProjet(projet);
    }

    public void supprimerProjet(int id) throws SQLException {
        projetDAO.supprimerProjet(id);
    }

    public List<Projet> getListeProjets() throws SQLException {
        return projetDAO.listerProjets();
    }

    public void affecterProjetAEquipe(int projetId, String equipeNom) throws SQLException {
        // Recherche de l'ID de l'équipe en fonction de son nom
        EquipeDAO equipeDAO = new EquipeDAO();
        int equipeId = equipeDAO.getEquipeIdByNom(equipeNom);

        // Mise à jour du projet pour lui assigner l'ID de l'équipe
        projetDAO.updateProjetEquipe(projetId, equipeId);
    }

    public JComboBox<String> remplirComboBox() throws SQLException {
        return (JComboBox<String>) projetDAO.remplirComboBox();
    }

    public List<Projet> listerProjets(String phase) {
        List<Projet> listeProjets = null;
        try {
            listeProjets = projetDAO.listerProjets(phase);
        } catch (SQLException e) {
            e.printStackTrace();
            // Gérer l'exception selon les besoins de votre application
        }
        return listeProjets;
    }

    public void PhaseCombo(String code, JComboBox<String> comboBox) throws SQLException {
        projetDAO.ajouterPhase(code, comboBox);
    }
}
