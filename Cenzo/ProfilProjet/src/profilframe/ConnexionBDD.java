/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profilframe;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
/**
 *
 * @author David
 */
public class ConnexionBDD {
    String filename = null;
    public static String path;
    Connection conn = null;
    public static Connection Connexion() throws ClassNotFoundException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/location_voiture","root","");
                if(conn != null)
                    System.out.println("Connexion effectué avec succès");
                else
                    System.out.println("Problème lors de la connexion a la BDD");
            return conn;
        }catch(SQLException e) {
            System.out.println("SQLExeption :" + e);
        return null;
        }
    }
    
    public void filen(){
        try{
            JFileChooser choix = new JFileChooser();
            choix.setDialogTitle("Choisir une image");
            choix.setApproveButtonText("Ajouter");
            choix.showOpenDialog(null);
            File f = choix.getSelectedFile();
            filename = f.getAbsolutePath();
            this.path =(filename);
        }catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Veuillez choisir une image" );
        }
    }
    
    public String getp(){
        return path;
    }
    
}
