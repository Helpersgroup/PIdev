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
import java.util.logging.Level;
import java.util.logging.Logger;
import pidev.entities.Client;
import pidev.presentation.Chiheb_Authentification;
import pidev.presentation.Chiheb_Espace_Client;
import pidev.presentation.GraphReaderExample;

/**
 *
 * @author Eya
 */
public class AnnonceDAO {

    int id;

    public boolean InsertAnnonce(Annonce a, int id) {

        String requete = "insert into Annonce (nom,type_Annonce,date_Deb,date_Fin,depart,destination,description,hebergement,type_Hebergement,transport,nbre_adultes,nbre_enfants,etat,id_Annonceur)"
                + " values" + " (?,?,?,?,?,?,?,?,?,?,?,?,1,?)";
        try {

            java.util.Date utilDate = a.getDate_deb();
            java.util.Date utilDate1 = a.getDate_fin();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            java.sql.Date sqlDate1 = new java.sql.Date(utilDate1.getTime());

            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, a.getNom());
            ps.setString(2, a.getType_annonce());
            ps.setDate(3, sqlDate);
            ps.setDate(4, sqlDate1);
            ps.setString(5, a.getDepart());
            ps.setString(6, a.getDestination());
            ps.setString(7, a.getDescription());
            ps.setString(8, a.getHebergement());
            ps.setString(9, a.getType_hebergement());
            ps.setString(10, a.getTransport());
            ps.setInt(11, a.getNbr_adultes());
            ps.setInt(12, a.getNbr_enfants());
            ps.setInt(13, id);


            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
            return true;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
            return false;
        }
    }
    int x = Chiheb_Authentification.id_connecté_normal;

    public boolean modifierAnnonce(Annonce a) {

        String req = "update Annonce set nom=?,type_Annonce=?,date_Deb=?,date_Fin=?,depart=?,destination=?,description=?,hebergement=?,type_Hebergement=?,transport=?,nbre_adultes=?,nbre_enfants=?,prix=? where  id_Annonce=57";
        try {

            java.util.Date utilDate = a.getDate_deb();
            java.util.Date utilDate1 = a.getDate_fin();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            java.sql.Date sqlDate1 = new java.sql.Date(utilDate1.getTime());

            PreparedStatement ps = MyConnection.getInstance().prepareStatement(req);
            ps.setString(1, a.getNom());
            ps.setString(2, a.getType_Annonce());
            ps.setDate(3, sqlDate);
            ps.setDate(4, sqlDate1);
            ps.setString(5, a.getDepart());
            ps.setString(6, a.getDestination());
            ps.setString(7, a.getDescription());
            ps.setString(8, a.getHebergement());
            ps.setString(9, a.getType_hebergement());
            ps.setString(10, a.getTransport());
            ps.setInt(11, a.getNbr_adultes());
            ps.setInt(12, a.getNbr_enfants());
            ps.setDouble(13, a.getPrix());

            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
            return true;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
            return false;
        }
    }

    public boolean deleteAnnonce(int id) {

        String requete = "delete from Annonce where id_Annonce=? ";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
            return true;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
            return false;
        }
    }

    public List<Annonce> DisplayAllAnnonce() {


        List<Annonce> listeAnnonce = new ArrayList<Annonce>();
        String requete = "select * from Annonce ";

        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Annonce a = new Annonce();


                a.setId_Annonce(resultat.getInt(1));
                a.setId_Annonceur(resultat.getInt(2));

                a.setNom(resultat.getString(3));
                a.setDate_deb(resultat.getDate(4));
                a.setDate_fin(resultat.getDate(5));
                a.setDepart(resultat.getString(6));
                a.setDestination(resultat.getString(7));
                a.setType_annonce(resultat.getString(11));
                a.setEtat(resultat.getInt(14));
                a.setNbr_enfants(resultat.getInt(15));
                a.setNbr_adultes(resultat.getInt(16));
                a.setPrix(resultat.getInt(17));
                listeAnnonce.add(a);
            }
            return listeAnnonce;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks " + ex.getMessage());
            return null;
        }
    }

    public List<Annonce> DisplayAllAnnonceResp(int id) {


        List<Annonce> listeAnnonce = new ArrayList<Annonce>();
        String requete = "select nom, destination,type_Annonce ,date_deb, date_fin  from Annonce type_Annonce where id_Annonce="+id+"Group by type_Annonce";

        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Annonce a = new Annonce();


                //  a.setId_Annonce(resultat.getInt(1));
                //  a.setId_Annonceur(resultat.getInt(2));

                a.setNom(resultat.getString(3));
                a.setDate_deb(resultat.getDate(4));
                a.setDate_fin(resultat.getDate(5));
                // a.setDepart(resultat.getString(6));
                a.setDestination(resultat.getString(7));
                a.setType_annonce(resultat.getString(11));
                //a.setEtat(resultat.getInt(14));
                //a.setNbr_enfants(resultat.getInt(15));
                //a.setNbr_adultes(resultat.getInt(16));
                //a.setPrix(resultat.getInt(17));
                listeAnnonce.add(a);
            }
            return listeAnnonce;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks " + ex.getMessage());
            return null;
        }
    }
   public Annonce selectAnnonce ( int id ){
      
       
       String requete = "select * from Annonce where id_Annonce="+id;
        
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            Annonce ann = new Annonce();
                    while(resultat.next()){
                      

                            ann.setId_Annonce(resultat.getInt(1));
                            ann.setId_Annonceur(resultat.getInt(2));
                            ann.setNom(resultat.getString(3));
                            ann.setDate_deb(resultat.getDate(4));
                            ann.setDate_fin(resultat.getDate(5));
                            ann.setDepart(resultat.getString(6));
                            ann.setDestination(resultat.getString(7));
                            ann.setDestination(resultat.getString(8));
                            ann.setType_Hebergement(resultat.getString(9));
                            ann.setHebergement(resultat.getString(10));
                            ann.setType_annonce(resultat.getString(11));
                            
                            ann.setEtat(resultat.getInt(14));
                            ann.setNbr_enfants(resultat.getInt(15));
                            ann.setNbr_adultes(resultat.getInt(16));
                            ann.setPrix(resultat.getInt(17));

             
                    }
        
                    return ann;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
                

                    }
   }

    public List<Annonce> Annonce_Recherche(String by,String contnu) {


        List<Annonce> listeAnnonce = new ArrayList<Annonce>();
        String requete = "select * from Annonce where "+by+" like "+contnu;

        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Annonce a = new Annonce();


                //  a.setId_Annonce(resultat.getInt(1));
                //  a.setId_Annonceur(resultat.getInt(2));

                a.setNom(resultat.getString(3));
                a.setDate_deb(resultat.getDate(4));
                a.setDate_fin(resultat.getDate(5));
                // a.setDepart(resultat.getString(6));
                a.setDestination(resultat.getString(7));
                a.setType_annonce(resultat.getString(11));
                //a.setEtat(resultat.getInt(14));
                //a.setNbr_enfants(resultat.getInt(15));
                //a.setNbr_adultes(resultat.getInt(16));
                //a.setPrix(resultat.getInt(17));
                listeAnnonce.add(a);
            }
            return listeAnnonce;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks " + ex.getMessage());
            return null;
        }
    }


}

