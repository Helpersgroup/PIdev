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
 * @author chiheb
 */
public class ResponsableDAO {
     int y=0;
    public int selectResponsable(int x){
               String  insertStr2 = "select id_Responsable from ResponsableAgence where id_Responsable="+x+""; 
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
            System.out.println("erreur lors de connection "+ex.getMessage()+insertStr2);
        }
        return y;
    }
    public void ajouterResponsable(){
     String insertStr3 = "insert into ResponsableAgence "
                            + "(id_Responsable,id_Agence) select MAX(id_Personne) "
                            + ","
                            + "(select MAX(id_Agence)from Agence) from Personne";
     
        try {
            
           
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(insertStr3);
               
                
                ps.executeUpdate(); 
           
           
            System.out.println("Ajout effectuée avec succès3");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }           
}
