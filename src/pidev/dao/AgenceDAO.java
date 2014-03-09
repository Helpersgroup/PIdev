/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import pidev.entities.Agence;
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
      
      
         public List<Agence> afficher_Agence (){
        String req= "select * from Agence ";
        List<Agence> agences=new ArrayList<Agence>();
        try{
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(req);
           
            while (resultat.next()){
                Agence a =new Agence();
                
                a.setNom(resultat.getString(2));
                a.setAdresse(resultat.getString(3));
                a.setTelephone(resultat.getInt(4));
                a.setVille(resultat.getString(5));
                
                
                
                agences.add(a);
            }
            return agences;
        }
            catch(SQLException ex){
            
        }
            
            return null;
    }

}
