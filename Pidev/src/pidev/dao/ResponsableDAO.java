/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import pidev.util.MyConnection;

/**
 *
 * @author chiheb
 */
public class ResponsableDAO {
    
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
