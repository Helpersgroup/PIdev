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
public class PersonneDAO {
    int x=0;
    String nc="";
    String pc="";
    public int selectPersonneByemailpass(String email,String password){
        
        try {
                           String  insertStr = "select id_Personne from Personne where email='"+email+"' and mdp ='"+password+"' "; 
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(insertStr);
            
           // PreparedStatement ps3 = MyConnection.getInstance().prepareStatement(insertStr3);
               ResultSet resultat = ps.executeQuery();
           
                
           
                while (resultat.next())
            {
             x = resultat.getInt(1);
                System.out.println("x"+x);
            }
        
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de connection "+ex.getMessage());
        }
                       
               return x;    
    }
    
    public void deconnexion(int id){
        String  insertStr="update  Personne set etat=0 where id_Personne="+id+"";
         try {
           
       PreparedStatement ps = MyConnection.getInstance().prepareStatement(insertStr);
         ps.executeUpdate();
         
           System.out.println("etat modifié");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la modification "+ex.getMessage());
        }
        
    }
    public int selectPersonneByemail(String email){
        String res ="select id_Personne from Personne where email='"+email+"'";
        try {
                           
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(res);
            
           // PreparedStatement ps3 = MyConnection.getInstance().prepareStatement(insertStr3);
               ResultSet resultat = ps.executeQuery();
           
                
           
                while (resultat.next())
            {
             x = resultat.getInt(1);
                System.out.println("x"+x);
            }
        
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de connection "+ex.getMessage());
        }
                       
        return x;
    }
   public void ajouterPersonne(String cin,String nom,String prenom,String email,int tel,String mdp){
        
       
       String  insertStr="insert into Personne (cin,nom,prenom,email,tel,etat,mdp) values("
                  
                    +cin+",'"
                    +prenom+"','"
                    +nom+"','"
                    +email+"',"
                    +tel+","
                    +1+",'"
                    +mdp+ "')";
         try {
           
       PreparedStatement ps = MyConnection.getInstance().prepareStatement(insertStr);
         ps.executeUpdate();
         
           System.out.println("Ajout effectuée avec succès1");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
    public String selectNomPersonneByid(int id){
        String res ="select nom from Personne where id_Personne='"+id+"'";
        try {
                           
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(res);
            
           // PreparedStatement ps3 = MyConnection.getInstance().prepareStatement(insertStr3);
               ResultSet resultat = ps.executeQuery();
           
                
           
                while (resultat.next())
            {
              nc = resultat.getString(1);
                System.out.println("x"+nc);
            }
        
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de connection "+ex.getMessage());
        }
                       
        return nc;
    }
    public String selectPrenomPersonneByid(int id){
        String res ="select prenom from Personne where id_Personne='"+id+"'";
        try {
                           
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(res);
            
           // PreparedStatement ps3 = MyConnection.getInstance().prepareStatement(insertStr3);
               ResultSet resultat = ps.executeQuery();
           
                
           
                while (resultat.next())
            {
              pc = resultat.getString(1);
                System.out.println("x"+pc);
            }
        
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de connection "+ex.getMessage());
        }
                       
        return pc;
    }

    public void connexion(int x) {
        String  insertStr="update  Personne set etat=1 where id_Personne="+x+"";
         try {
           
       PreparedStatement ps = MyConnection.getInstance().prepareStatement(insertStr);
         ps.executeUpdate();
         
           System.out.println("etat modifié");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la modification "+ex.getMessage());
        }
    }
}
