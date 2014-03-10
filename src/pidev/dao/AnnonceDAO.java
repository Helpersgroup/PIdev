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
import pidev.presentation.Authentification;
import pidev.presentation.Espace_Client;
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
    public boolean modifierAnnonce(Annonce annonce) {
                    Annonce a = annonce;
            java.util.Date utilDate = a.getDate_deb();
            java.util.Date utilDate1 = a.getDate_fin();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            java.sql.Date sqlDate1 = new java.sql.Date(utilDate1.getTime());
        String req = "update Annonce set id_annonceur="+a.getId_Annonceur()+",nom='"+a.getNom()+"',type_Annonce='"+a.getType_Annonce()+"',date_Deb='"+sqlDate+"' , date_Fin='"+sqlDate1+"',depart='"+a.getDepart()+"',destination='"+a.getDestination()+"',description='"+a.getDescription()+"',hebergement='"+a.getHebergement()+"',type_Hebergement='"+a.getType_hebergement()+"' , transport='"+a.getTransport()+"' , nbre_adultes="+a.getNbr_adultes()+" , nbre_enfants="+a.getNbr_enfants()+" , etat=1 , prix="+a.getPrix()+" where id_Annonce=" + a.getId_Annonce();
        try {

            PreparedStatement ps = MyConnection.getInstance().prepareStatement(req);
           
            System.out.println(req);
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès ok ");
            return true;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
            return false;
        }
    }

    public void selectID(int id) {
        Annonce a = new Annonce();

        String req = "select id_Annonce from Annonce where id_Annonceur=" + id;
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(req);
            while (resultat.next()) {
                a.setId_Annonceur(resultat.getInt(1));

            }

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks " + ex.getMessage());
        }

    }

    public boolean deleteAnnonce(int id) {
        String req1="delete from Jaime where id_Annonce=? ";
        String req2="delete from Commentaire where id_Annonce=? ";
        String req3="delete from reservation where id_Annonce=? ";
        String requete = "delete from Annonce where id_Annonce=? ";
        try {
            PreparedStatement ps1 = MyConnection.getInstance().prepareStatement(req1);
            PreparedStatement ps2 = MyConnection.getInstance().prepareStatement(req2);
            PreparedStatement ps3 = MyConnection.getInstance().prepareStatement(req2);
            PreparedStatement ps4 = MyConnection.getInstance().prepareStatement(requete);
            ps1.setInt(1, id);
            ps2.setInt(1, id);
            ps3.setInt(1, id);
            ps4.setInt(1, id);
            ps1.executeUpdate();
            ps2.executeUpdate();
            ps3.executeUpdate();
            ps4.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
            return true;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
            return false;
        }
    }

    public List<Annonce> DisplayAllAnnonce(int min,int max) {

        
        List<Annonce> listeAnnonce = new ArrayList<Annonce>();
        
        String requete = "select * from Annonce where etat=1 limit "+min+","+max;
        //System.out.println(requete);
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
            System.out.println("erreur lors du chargement des annonces " + ex.getMessage());
            return null;
        }
    }
public List<Annonce> DisplayAllAnnonce() {

        //limit=10;
        List<Annonce> listeAnnonce = new ArrayList<Annonce>();
        
        String requete = "select * from Annonce where etat=1";
        System.out.println(requete);
        
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
            System.out.println("erreur lors du chargement des annonces " + ex.getMessage());
            return null;
        }
    }
    public List<Annonce> findByRandonnee() {

        List<Annonce> listeannonces = new ArrayList<Annonce>();

        String requete = "select nom,destination,date_Deb,date_Fin,type_Annonce from Annonce where etat=1 and type_Annonce='Randonnée'";
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                Annonce annonce = new Annonce();
                // annonce.setId_Annonce(resultat.getInt(1));
                //annonce.setId_Annonceur(resultat.getInt(2));
                annonce.setNom(resultat.getString(3));
                annonce.setDate_deb(resultat.getDate(4));
                annonce.setDate_fin(resultat.getDate(5));
                //annonce.setDepart(resultat.getString(6));
                annonce.setDestination(resultat.getString(7));
                // annonce.setDescription(resultat.getString(8));
                //annonce.setHebergement(resultat.getString(9));
                //annonce.setType_hebergement(resultat.getString(10));
                annonce.setType_annonce(resultat.getString(11));
                // annonce.setTransport(resultat.getString(12));
                // annonce.setNote(resultat.getInt(13));
                // annonce.setEtat(resultat.getInt(14));
                //annonce.setNbr_enfants(resultat.getInt(15));
                //annonce.setNbr_adultes(resultat.getInt(16));




                listeannonces.add(annonce);
            }

            System.out.println("bien");
            return listeannonces;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des annonces " + ex.getMessage());
            return null;
        }
    }

    public List<Annonce> findByAffaire() {

        List<Annonce> listeannonces = new ArrayList<Annonce>();

        String requete = "select nom, destination,date_Deb,date_Fin,type_Annonce from Annonce where etat=1 and type_Annonce='Affaire'";
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                Annonce annonce = new Annonce();
                //annonce.setId_Annonce(resultat.getInt(1));
                //annonce.setId_Annonceur(resultat.getInt(2));
                annonce.setNom(resultat.getString(3));
                annonce.setDate_deb(resultat.getDate(4));
                annonce.setDate_fin(resultat.getDate(5));
                //annonce.setDepart(resultat.getString(6));
                annonce.setDestination(resultat.getString(7));
                //annonce.setDescription(resultat.getString(8));
                //annonce.setHebergement(resultat.getString(9));
                //annonce.setType_hebergement(resultat.getString(10));
                annonce.setType_annonce(resultat.getString(11));
                // annonce.setTransport(resultat.getString(12));
                // annonce.setNote(resultat.getInt(13));
                // annonce.setEtat(resultat.getInt(14));
                // annonce.setNbr_enfants(resultat.getInt(15));
                // annonce.setNbr_adultes(resultat.getInt(16));




                listeannonces.add(annonce);
            }

            System.out.println("bien");
            return listeannonces;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des annonces " + ex.getMessage());
            return null;
        }
    }

    public List<Annonce> findByBienEtre() {

        List<Annonce> listeannonces = new ArrayList<Annonce>();

        String requete = "select nom, destination,description,date_Deb,date_Fin,type_Annonce from Annonce where etat=1 and type_Annonce='Bien etre'";
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                Annonce annonce = new Annonce();
                // annonce.setId_Annonce(resultat.getInt(1));
                //annonce.setId_Annonceur(resultat.getInt(2));
                annonce.setNom(resultat.getString(3));
                annonce.setDate_deb(resultat.getDate(4));
                annonce.setDate_fin(resultat.getDate(5));
                //annonce.setDepart(resultat.getString(6));
                annonce.setDestination(resultat.getString(7));
                annonce.setDescription(resultat.getString(8));
                //annonce.setType_hebergement(resultat.getString(10));
                annonce.setType_annonce(resultat.getString(11));
                // annonce.setTransport(resultat.getString(12));
                // annonce.setNote(resultat.getInt(13));
                // annonce.setEtat(resultat.getInt(14));
                //annonce.setNbr_enfants(resultat.getInt(15));
                //annonce.setNbr_adultes(resultat.getInt(16));

                listeannonces.add(annonce);
            }

            System.out.println("bien");
            return listeannonces;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des annonces " + ex.getMessage());
            return null;
        }
    }

    public List<Annonce> findByVoyageDecouverte() {

        List<Annonce> listeannonces = new ArrayList<Annonce>();

        String requete = "select nom, destination,date_Deb,date_Fin,type_Annonce from Annonce where etat=1 and type_Annonce='Voyage de découverte'";
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                Annonce annonce = new Annonce();
                // annonce.setId_Annonce(resultat.getInt(1));
                //annonce.setId_Annonceur(resultat.getInt(2));
                annonce.setNom(resultat.getString(3));
                annonce.setDate_deb(resultat.getDate(4));
                annonce.setDate_fin(resultat.getDate(5));
                //annonce.setDepart(resultat.getString(6));
                annonce.setDestination(resultat.getString(7));
                // annonce.setDescription(resultat.getString(8));
                //annonce.setHebergement(resultat.getString(9));
                //annonce.setType_hebergement(resultat.getString(10));
                annonce.setType_annonce(resultat.getString(11));
                // annonce.setTransport(resultat.getString(12));
                // annonce.setNote(resultat.getInt(13));
                // annonce.setEtat(resultat.getInt(14));
                //annonce.setNbr_enfants(resultat.getInt(15));
                //annonce.setNbr_adultes(resultat.getInt(16));

                listeannonces.add(annonce);
            }

            System.out.println("bien");
            return listeannonces;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des annonces " + ex.getMessage());
            return null;
        }
    }

    public List<Annonce> findByVoyageNoce() {

        List<Annonce> listeannonces = new ArrayList<Annonce>();

        String requete = "select nom, destination,description,date_Deb,date_Fin,type_Annonce from Annonce where etat=1 and type_Annonce='Voyage de noce'";
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                Annonce annonce = new Annonce();
                // annonce.setId_Annonce(resultat.getInt(1));
                //annonce.setId_Annonceur(resultat.getInt(2));
                annonce.setNom(resultat.getString(3));
                annonce.setDate_deb(resultat.getDate(4));
                annonce.setDate_fin(resultat.getDate(5));
                //annonce.setDepart(resultat.getString(6));
                annonce.setDestination(resultat.getString(7));
                annonce.setDescription(resultat.getString(8));
                //annonce.setHebergement(resultat.getString(9));
                //annonce.setType_hebergement(resultat.getString(10));
                annonce.setType_annonce(resultat.getString(11));
                // annonce.setTransport(resultat.getString(12));
                // annonce.setNote(resultat.getInt(13));
                // annonce.setEtat(resultat.getInt(14));
                //annonce.setNbr_enfants(resultat.getInt(15));
                //annonce.setNbr_adultes(resultat.getInt(16));

                listeannonces.add(annonce);
            }

            System.out.println("bien");
            return listeannonces;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des annonces " + ex.getMessage());
            return null;
        }
    }

    public List<Annonce> findByCamping() {

        List<Annonce> listeannonces = new ArrayList<Annonce>();

        String requete = "select nom, destination,description,date_Deb,date_Fin,type_Annonce from Annonce where etat=1 and type_Annonce='Camping'";
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                Annonce annonce = new Annonce();
                // annonce.setId_Annonce(resultat.getInt(1));
                //annonce.setId_Annonceur(resultat.getInt(2));
                annonce.setNom(resultat.getString(3));
                annonce.setDate_deb(resultat.getDate(4));
                annonce.setDate_fin(resultat.getDate(5));
                //annonce.setDepart(resultat.getString(6));
                annonce.setDestination(resultat.getString(7));
                //annonce.setDescription(resultat.getString(8));
                //annonce.setHebergement(resultat.getString(9));
                //annonce.setType_hebergement(resultat.getString(10));
                annonce.setType_annonce(resultat.getString(11));
                // annonce.setTransport(resultat.getString(12));
                // annonce.setNote(resultat.getInt(13));
                // annonce.setEtat(resultat.getInt(14));
                //annonce.setNbr_enfants(resultat.getInt(15));
                //annonce.setNbr_adultes(resultat.getInt(16));

                listeannonces.add(annonce);
            }

            System.out.println("bien");
            return listeannonces;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des annonces " + ex.getMessage());
            return null;
        }
    }

    public List<Annonce> rech(String contenu, int id_Responsable) {

        String requete;
        List<Annonce> listeAnnonce = new ArrayList<Annonce>();
        if(contenu.equals(""))
        {
             requete = "SELECT id_Annonce,nom, destination,depart ,date_deb, prix "
                     + "FROM Annonce WHERE id_Annonceur="+id_Responsable;
        }else{
                 requete = "SELECT id_Annonce,nom, destination,type_Annonce ,date_deb, prix"
                         + " FROM Annonce WHERE "
                        + "(nom LIKE '%"+contenu+"%' "
                        + "or upper(type_Annonce) like upper('%"+contenu+"%') "
                        + "or upper(description) like upper('%"+contenu+"%') "
                        + "or upper(type_Hebergement) like upper('%"+contenu+"%') "
                        + "or upper(hebergement) like upper('%"+contenu+"%') "
                        + "or upper(destination) like upper('%"+contenu+"%') "
                        + "or upper(depart) like upper('%"+contenu+"%')) "
                        + "and id_Annonceur="+id_Responsable+"";
        }
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Annonce a = new Annonce();


                a.setId_Annonce(resultat.getInt(1));
                //  a.setId_Annonceur(resultat.getInt(2));

                a.setNom(resultat.getString(2));
                a.setDestination(resultat.getString(3));
                a.setDepart(resultat.getString(4));
                a.setDate_deb(resultat.getDate(5));
                //a.setDate_fin(resultat.getDate(6));
                 
                //a.setType_annonce(resultat.getString(4));
                //a.setEtat(resultat.getInt(14));
                //a.setNbr_enfants(resultat.getInt(15));
                //a.setNbr_adultes(resultat.getInt(16));
                a.setPrix(resultat.getInt(6));
                listeAnnonce.add(a);
            }
            return listeAnnonce;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks " + ex.getMessage());
            return null;
        }
    }
public List<Annonce> rech_annonce(String contenu) {

        String requete;
        List<Annonce> listeAnnonce = new ArrayList<Annonce>();
        if(contenu.equals(""))
        {
             requete = "SELECT id_Annonce,nom, depart,destination ,date_deb, prix "
                     + "FROM Annonce WHERE etat=1";
        }else{
                 requete = "SELECT id_Annonce,nom, destination,type_Annonce ,date_deb, prix"
                         + " FROM Annonce WHERE "
                        + "(UPPER(nom) LIKE upper('%"+contenu+"%') "
                        + "or UPPER(type_Annonce) like upper('%"+contenu+"%') "
                        + "or UPPER(description) like upper('%"+contenu+"%') "
                        + "or upper(type_Hebergement) like upper('%"+contenu+"%') "
                        + "or upper(hebergement) like upper('%"+contenu+"%') "
                        + "or upper(destination) like upper('%"+contenu+"%') "
                        + "or upper(depart) like upper('%"+contenu+"%')) "
                        + "and etat=1";
        }
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Annonce a = new Annonce();


                a.setId_Annonce(resultat.getInt(1));
                //  a.setId_Annonceur(resultat.getInt(2));

                a.setNom(resultat.getString(2));
                a.setDestination(resultat.getString(4));
                a.setDepart(resultat.getString(3));
                a.setDate_deb(resultat.getDate(5));
                //a.setDate_fin(resultat.getDate(6));
                 
                //a.setType_annonce(resultat.getString(4));
                //a.setEtat(resultat.getInt(14));
                //a.setNbr_enfants(resultat.getInt(15));
                //a.setNbr_adultes(resultat.getInt(16));
                a.setPrix(resultat.getInt(6));
                listeAnnonce.add(a);
            }
            return listeAnnonce;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks " + ex.getMessage());
            return null;
        }
    }
    public List<Annonce> DisplayAllAnnonceResp(int id_Responsable) {


        List<Annonce> listeAnnonce = new ArrayList<Annonce>();
        String requete = "select id_Annonce,nom, destination,depart ,date_deb, prix  from Annonce where id_Annonceur=" + id_Responsable + "";

        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Annonce a = new Annonce();


                  a.setId_Annonce(resultat.getInt(1));
                //  a.setId_Annonceur(resultat.getInt(2));

                a.setNom(resultat.getString(2));
                a.setDestination(resultat.getString(3));
                a.setDepart(resultat.getString(4));
                a.setDate_deb(resultat.getDate(5));
                //a.setDate_fin(resultat.getDate(6));
                 
                //a.setType_annonce(resultat.getString(4));
                //a.setEtat(resultat.getInt(14));
                //a.setNbr_enfants(resultat.getInt(15));
                //a.setNbr_adultes(resultat.getInt(16));
                a.setPrix(resultat.getInt(6));
                listeAnnonce.add(a);
            }
            return listeAnnonce;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks " + ex.getMessage());
            return null;
        }
    }

    public Annonce selectAnnonce(int id) {


        String requete = "select * from Annonce where id_Annonce=" + id;

        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            Annonce ann = new Annonce();
            while (resultat.next()) {

                ann.setId_Annonce(resultat.getInt(1));
                ann.setId_Annonceur(resultat.getInt(2));
                ann.setNom(resultat.getString(3));
                ann.setDate_deb(resultat.getDate(4));
                ann.setDate_fin(resultat.getDate(5));
                ann.setDepart(resultat.getString(6));
                ann.setDestination(resultat.getString(7));
                ann.setHebergement(resultat.getString(9));
                ann.setDescription(resultat.getString(8));
                ann.setType_Hebergement(resultat.getString(10));
                ann.setType_annonce(resultat.getString(11));
                ann.setTransport(resultat.getString(12));
                ann.setEtat(resultat.getInt(14));
                ann.setNbr_enfants(resultat.getInt(15));
                ann.setNbr_adultes(resultat.getInt(16));
                ann.setPrix(resultat.getInt(17));


            }

            return ann;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks " + ex.getMessage());
            return null;


        }
    }
}
