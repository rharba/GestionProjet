package dao1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
    private static DAO obj;
    private static Connection con;


    private DAO() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/gestion_projet","root","");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Connection getCon() {
        if (obj == null)
            obj = new DAO();
        return con;
    }

    public static class PhaseDAO {

        public PhaseDAO() {
        }
    }
}
