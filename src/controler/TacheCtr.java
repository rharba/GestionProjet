package controler;

import dao1.TacheDAO;
import entiter.Phase;
import entiter.Tache;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class TacheCtr {

    // Méthode pour récupérer la liste des tâches pour une phase donnée
    public List<Tache> getListeTaches(int idPhase) throws SQLException {
        TacheDAO tacheDAO = new TacheDAO();
        return tacheDAO.listerTaches(idPhase);
    }
    
    // Méthode pour récupérer l'ID de la phase sélectionnée par son nom
    public int getPhaseIdByName(String nomPhase) throws SQLException {
    PhaseCtr phaseCtr = new PhaseCtr();
    List<Phase> phases = phaseCtr.getListePhases(); // Suppose que getListePhases() renvoie une liste d'objets Phase
    for (Phase phase : phases) {
        if (phase.getNom().equals(nomPhase)) {
            return phase.getId();
        }
    }
    return -1; // Retourne -1 si la phase n'est pas trouvée
}

    // Méthode pour remplir la table des tâches dans l'IHM
    public void remplirTableTache(List<Tache> listeTaches, DefaultTableModel model) {
        model.setRowCount(0); // Effacer les données existantes dans la table
        for (Tache tache : listeTaches) {
            Object[] rowData = {tache.getId(), tache.getNom(), tache.getDescription(), tache.getDateDebut(), tache.getDateFin()};
            model.addRow(rowData);
        }
    }
}
