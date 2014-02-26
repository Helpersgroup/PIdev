/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.dao;
import pidev.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import pidev.entities.Annonce;
import java.util.Date;
import pidev.entities.Client;
/**
 *
 * @author Eya
 */
public class AnnonceDAO {

     public void InsertAnnonce(Annonce a){
         
                    String requete = "insert into Annonce (nom,type_Annonce,date_Deb,date_Fin,depart,destination,description,hebergement,type_Hebergement,transport,note) values (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            
            java.util.Date utilDate = a.getDate_deb();  
            java.util.Date utilDate1 = a.getDate_fin();     
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());  
            java.sql.Date sqlDate1 = new java.sql.Date(utilDate1.getTime());

            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
                ps.setString(1,a.getNom());
                ps.setString(2,a.getType_annonce());
                ps.setDate(3,sqlDate);
                ps.setDate(4,sqlDate1);
                ps.setString(5,a.getDepart());
                ps.setString(6,a.getDestination());
                ps.setString(7,a.getDescription());
                ps.setString(8,a.getHebergement());
                ps.setString(9,a.getType_hebergement());
                ps.setString(10,a.getTransport());
                ps.setInt   (11,a.getNote());
                
                ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
                             
    public List<Annonce> DisplayAllAnnonces (){


        List<Annonce> listeannonces = new ArrayList<Annonce>();

        String requete = "select * from annonce";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Annonce annonce =new Annonce();
                annonce.setId_Annonce(resultat.getInt(1));
                annonce.setId_Annonceur(resultat.getInt(2));
                annonce.setNom(resultat.getString(3));
                annonce.setDate_deb(resultat.getDate(4));
                annonce.setDate_fin(resultat.getDate(5));
                annonce.setDepart(resultat.getString(6));
                annonce.setDestination(resultat.getString(7));
                annonce.setDescription(resultat.getString(8));
                annonce.setHebergement(resultat.getString(9));
                annonce.setType_hebergement(resultat.getString(10));
                annonce.setType_annonce(resultat.getString(11));
                annonce.setTransport(resultat.getString(12));
                annonce.setNote(resultat.getInt(13));
                annonce.setEtat(resultat.getInt(14));
                annonce.setNbr_enfants(resultat.getInt(15));
                annonce.setNbr_adultes(resultat.getInt(16));
               
                
                

                listeannonces.add(annonce);
            }
            return listeannonces;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des annonces "+ex.getMessage());
            return null;
        }
    }
     public List<Annonce> DisplayAnnonceByClient (int id){
        
           
        List<Annonce> listeannonces = new ArrayList<Annonce>();

        String requete = "select * from annonce";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Annonce annonce =new Annonce();
                annonce.setId_Annonce(resultat.getInt(1));
                annonce.setId_Annonceur(resultat.getInt(2));
                annonce.setNom(resultat.getString(3));
                annonce.setDate_deb(resultat.getDate(4));
                annonce.setDate_fin(resultat.getDate(5));
                annonce.setDepart(resultat.getString(6));
                annonce.setDestination(resultat.getString(7));
                annonce.setDescription(resultat.getString(8));
                annonce.setHebergement(resultat.getString(9));
                annonce.setType_hebergement(resultat.getString(10));
                annonce.setType_annonce(resultat.getString(11));
                annonce.setTransport(resultat.getString(12));
                annonce.setNote(resultat.getInt(13));
                annonce.setEtat(resultat.getInt(14));
                annonce.setNbr_enfants(resultat.getInt(15));
                annonce.setNbr_adultes(resultat.getInt(16));
               
                
                

                listeannonces.add(annonce);
            }
            return listeannonces;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des annonces "+ex.getMessage());
            return null;
        }
    }
}
