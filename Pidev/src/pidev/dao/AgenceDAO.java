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
public class AgenceDAO {
    
    
    public void ajouterAgence(String nomagence,String adresseagence,int telagence,String villeagence){
        
        String  insertStr="insert into Agence (nom,adresse,telephone,ville) values('"
                    +nomagence+"','"
                    +adresseagence+"',"
                    +telagence+",'"
                    +villeagence+"')";
            try {
                PreparedStatement ps = MyConnection.getInstance().prepareStatement(insertStr);
               
                ps.executeUpdate(); 
            
            System.out.println("Ajout effectuée avec succès2");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
}
