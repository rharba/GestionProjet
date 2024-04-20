
package controler;

import IHM.NewJFrame;
import dao1.PhaseDAO;
import dao1.TacheDAO;
import entiter.Phase;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class PlanificationController {
    private PhaseDAO phaseDAO;
    private TacheDAO tacheDAO;

   
      public void ajouterPhase(Phase phase) throws SQLException {
        phaseDAO.ajouterPhase(phase);
    }

    public List<Phase> listerPhases() throws SQLException {
        return phaseDAO.listerPhases();
    }


    public void supprimerPhase(int id) throws SQLException {
        phaseDAO.supprimerPhase(id);
    }

}

  
  