package controler;

import dao1.EquipeDAO;
import java.sql.SQLException;
import java.util.List;

public class EquipeCtr {
    
    // Méthode pour récupérer la liste des noms des équipes
  public List<String> getListeNomsEquipes() throws SQLException {
    EquipeDAO equipeDAO = new EquipeDAO();
    equipeDAO.openConnection(); // Assurez-vous d'ouvrir la connexion
    List<String> nomsEquipes = equipeDAO.getNomsEquipes();
    // N'oubliez pas de fermer la connexion
    return nomsEquipes;
}
    
}
