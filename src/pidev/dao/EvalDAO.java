/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pidev.entities.Annonce;
import pidev.entities.Evaluer;
import pidev.util.MyConnection;



public class EvalDAO {
    
public static   EvalDAO   evalDAO=null;
    
    public void AjouterCommentaire(String msg,int id_Personne,int id_Annonce){

         String requete = "insert into Commentaire (id_Annonce,id_Personne,message) values (?,?,?)";
        try { 
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id_Annonce);
            ps.setInt(2, id_Personne);
            ps.setString(3,msg);
            ps.executeUpdate();
            System.out.println("insertion c bon");
        } catch (SQLException ex) {
           
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
    
    public void SupprimerCom(int id){

          String requete = "delete from message where id=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
public void jaime(int id_Personne,int id_Annonce){

         String requete = "insert into Jaime (id_Annonce,id_Personne) values (?,?)";
        try { 
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id_Annonce);
            ps.setInt(2, id_Personne);
            ps.executeUpdate();
            System.out.println("Jaime c bon");
        } catch (SQLException ex) {
           
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }

public void note(int n,int id_Annonce){
            
         String req = "select note from Annnonce where id_annonce="+id_Annonce;
         Statement statement;
        int r=0;
         try {
            statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(req);
           
        r = (n+resultat.getInt(2))/2;
        } catch (SQLException ex) {
            Logger.getLogger(EvalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
               
         String requete = "update Annonce set note = ? where id_Annonce="+id_Annonce;
        
         try { 
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1,r );
            ps.executeUpdate();
            System.out.println("note c bon");
        } catch (SQLException ex) {
           
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }

            public List<Evaluer> getCommentaire(int id_Annonce) 
            {
                List<Evaluer> eval = new ArrayList<Evaluer>();
                 String requete = "select * from Commentaire C,Personne P where (P.id_Personne=C.id_Personne and C.id_Annonce="+id_Annonce+" )";
                
                 String nl=System.getProperty("line.separator"); 
                 try { 
                        PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
                        ResultSet r=ps.executeQuery();
                        while(r.next()){
                           Evaluer e=new Evaluer();
                           e.setId_personne(r.getInt(2));
                           e.setId_annonce(r.getInt(3));
                           
                           e.setMessage(r.getString(4));
                           e.setNom(r.getString(7));
                           eval.add(e);
                        }
                        
                        return eval;
                        
                    } catch (SQLException ex) {
                        
                        System.out.println("erreur get commentaire "+ex.getMessage());
                    }
                 return null;
            }
            
       public void signaler(int id_Annonce){
            
         String req = "update Annonce set nbre_signal=nbre_signal+1";
        

         try {
           PreparedStatement ps = MyConnection.getInstance().prepareStatement(req);
           ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EvalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
               
         
    }     
     public int getnb_signal(int id_Annonce) 
            {
                List<Evaluer> eval = new ArrayList<Evaluer>();
                 String requete = "select * from Annonce where id_Annonce="+id_Annonce;
                 Evaluer e=new Evaluer();
                 try { 
                        PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
                        ResultSet r=ps.executeQuery();
                        while(r.next()){
                           
                           e.setNb_signal(r.getInt(18));
                           
                        }
                        
                        return e.getNb_signal() ;
                        
                    } catch (SQLException ex) {
                        
                        System.out.println("erreur get nb signal "+ex.getMessage());
                    }
                 return 0;
            }
          public List<Annonce> getAnnonce_signaler() 
            {
                List<Annonce> annonces = new ArrayList<Annonce>();
                 String requete = "select * from Annonce where nbre_signal>0";
                 
                 try { 
                        PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
                        ResultSet r=ps.executeQuery();
                        while(r.next()){
                           Annonce annonce=new Annonce();
                           annonce.setId_Annonce(r.getInt(1));
                           annonce.setNom(r.getString(3));
                           annonce.setNbre_signal(r.getInt(18));
                           annonces.add(annonce);
                           

                        }
                        return annonces ;
                        
                    } catch (SQLException ex) {
                        
                        System.out.println("erreur get nb signal "+ex.getMessage());
                    }
                 return null;
            }
                         
            

        }
