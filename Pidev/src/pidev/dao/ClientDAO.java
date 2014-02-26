/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pidev.util.MyConnection;

/**
 *
 * @author Abdelaziz
 */
public class ClientDAO {
    int y=0;
    public int selectClient(int x){
               String  insertStr2 = "select id_Client from Client where id_Client="+x+""; 
            try {
               PreparedStatement ps2 = MyConnection.getInstance().prepareStatement(insertStr2);
           
            ResultSet resultat2 = ps2.executeQuery();
             while (resultat2.next())
            {
           y = resultat2.getInt(1);
                System.out.println("y"+y);
            }
              } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de connection "+ex.getMessage());
        }
        return y;
    }
 public void   ajouterClient(){
     
      String insertStr2 = "insert into Client (id_Client) select MAX(id_Personne) from Personne";
      
       try {
           
            PreparedStatement ps2 = MyConnection.getInstance().prepareStatement(insertStr2);
           
             ps2.executeUpdate();      
           
           
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
 }
    
}
