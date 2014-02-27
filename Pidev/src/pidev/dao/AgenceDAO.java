/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import pidev.util.MyConnection;

/**
 *
 * @author chiheb
 */
public class AgenceDAO {
    
     String y="";
     int x=0;
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
    
    public int selectIdAgence (int w){
        String req= "select id_Agence from ResponsableAgence where id_Responsable="+w+"";
        try{
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(req);
           
            while (resultat.next()){
                x=resultat.getInt(1);
                
                
                
                
                
            }
        }
            catch(SQLException ex){
            
            
        }
            
            return x;
    }
      public String selectNomAgence (int w){
        String req= "select nom from Agence where id_Agence="+w+"";
      
        try{
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(req);
           
            while (resultat.next()){
                y=resultat.getString(1);
                
                
                
                
                
            }
        }
            catch(SQLException ex){
            
            
        }
            
            return y;
    }

}
