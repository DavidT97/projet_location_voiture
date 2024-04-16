
package hashem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db {
    Connection conn = null;
    public static Connection Connexion() throws ClassNotFoundException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/location_voiture","root","");
                if(con != null)
                    System.out.println("Connexion effectué avec succès");
                else
                    System.out.println("Problème lors de la connexion a la BDD");
            return con;
        }catch(SQLException e) {
            System.out.println("SQLExeption :" + e);
        return null;
        }
    }
}