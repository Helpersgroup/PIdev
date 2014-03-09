/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pidev.entities.Personne;
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
        public boolean delete(int cin){
            Personne P=new Personne();
           String res ="select id_Personne from Personne where cin="+cin+"";
             try {
                           
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(res);
            
               ResultSet resultat = ps.executeQuery();

                while (resultat.next())
                {
                  P.setId_Personne(resultat.getInt(1));

                }
        
        } catch (SQLException ex) {
            return false;
          
        }  
            
         String  req1="delete from Commentaire where id_Personne="+P.getId_Personne();
         String  req3="delete from Jaime where id_Personne="+P.getId_Personne();
         String  req4="delete from reservation where id_Client="+P.getId_Personne();
         String  req2="delete from Annonce where id_Annonceur="+P.getId_Personne();
         String  req5="delete from Client where id_Client="+P.getId_Personne();
         String  req6= "delete from ResponsableAgence where id_Responsable="+P.getId_Personne();
         String  req7= "delete from Personne where id_Personne="+P.getId_Personne();
         try {
           
       PreparedStatement ps1 = MyConnection.getInstance().prepareStatement(req1);
       PreparedStatement ps2 = MyConnection.getInstance().prepareStatement(req2);
       PreparedStatement ps3 = MyConnection.getInstance().prepareStatement(req3);
       PreparedStatement ps4 = MyConnection.getInstance().prepareStatement(req4);
       PreparedStatement ps5 = MyConnection.getInstance().prepareStatement(req5);
       PreparedStatement ps6 = MyConnection.getInstance().prepareStatement(req6);
       PreparedStatement ps7 = MyConnection.getInstance().prepareStatement(req7);
      
         ps1.execute();
         ps3.execute();
         ps4.execute();
         ps2.execute();
         ps5.execute();
         ps6.execute();
         ps7.execute();
 
         return true;
        } catch (SQLException ex) {
            return false;
        }
        
    }
           public boolean delete_Annonce(int id_ann){
            
             
            
         String  req1="delete from Commentaire where id_Annonce="+id_ann;
         String  req3="delete from Jaime where id_Annonce="+id_ann;
         String  req4="delete from reservation where id_Annonce="+id_ann;
         String  req2="delete from Annonce where id_Annonce="+id_ann;
         
         try {
           
       PreparedStatement ps1 = MyConnection.getInstance().prepareStatement(req1);
       PreparedStatement ps2 = MyConnection.getInstance().prepareStatement(req2);
       PreparedStatement ps3 = MyConnection.getInstance().prepareStatement(req3);
       PreparedStatement ps4 = MyConnection.getInstance().prepareStatement(req4);

      
         ps1.execute();
         ps3.execute();
         ps4.execute();
         ps2.execute();
        
 
         return true;
        } catch (SQLException ex) {
            return false;
        }
        
    }     
        
    
}
