
package controler;

import dao1.TacheDAO;
import entiter.Tache;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class AvancementController {
    private TacheDAO tacheDAO;

    public AvancementController(Connection connection) {
       tacheDAO = new TacheDAO();
    }

   public void ajouterTache(Tache tache) throws SQLException {
    tacheDAO.insererTache(tache);
}

    // Autres méthodes du contrôleur pour interagir avec les DAO
}