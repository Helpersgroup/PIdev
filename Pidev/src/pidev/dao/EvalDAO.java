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

            public String getCommentaire(int id_Annonceur,int id_Annonce) 
            {
                 String requete = "select message from Commentaire where(id_Personne="+id_Annonceur+" and id_Annonce="+id_Annonce+" )";
                 String com="";
                 String nl=System.getProperty("line.separator"); 
                 try { 
                        PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
                        ResultSet r=ps.executeQuery();
                        while(r.next()){
                           com+=""+r.getString(1)+nl;
                        }
                        System.out.println("Jaime c bon"+com);
                        return com;
                        
                    } catch (SQLException ex) {
                        
                        System.out.println("erreur get commentaire "+ex.getMessage());
                    }
                 return "";
            }

        }
