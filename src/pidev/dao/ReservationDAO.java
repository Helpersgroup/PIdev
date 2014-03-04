/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.dao;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import pidev.entities.Annonce;
import pidev.entities.Reservation;
import pidev.presentation.GraphReaderExample;
import pidev.presentation.fiche_reservation;
import pidev.util.*;

public class ReservationDAO {

    public List<Reservation> DisplayReservationByClient(int id) {


        List<Reservation> listereservations = new ArrayList<Reservation>();
        //int idml=36;
       // idml = GraphReaderExample.idCC;
        String requete1 = ("select * from reservation where Id_Client=" + id);
        try {
            Statement statement1 = MyConnection.getInstance()
                    .createStatement();
            ResultSet resultat1 = statement1.executeQuery(requete1);

            while (resultat1.next()) {
                //Reservation res = new Reservation(resultat1.getInt(1), resultat1.getInt(2), resultat1.getInt(3), resultat1.getDate(4));
                Reservation reservation = new Reservation();
                reservation.setId_Client(resultat1.getInt(1));
                reservation.setId_Annonce(resultat1.getInt(2));
                reservation.setEtat(resultat1.getInt(3));
                reservation.setDate(resultat1.getDate(4));
                System.out.println("Réservation test: " + reservation.toString());
                listereservations.add(reservation);
            }
            return listereservations;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des annonces " + ex.getMessage());
            return null;
        }
    }

    public List<Annonce> DisplayAnnonceByReservation() {

        List<Reservation> l = DisplayReservationByClient(36);
        
        List<Annonce> listeannonces1 = new ArrayList<Annonce>();
        for (Reservation r : l) {
            System.out.println("testing: " + r.getId_Annonce());
            String requete2 = ("select nom from Annonce where Id_Annonce=" + r.getId_Annonce());
            try {
                Statement statement = MyConnection.getInstance().createStatement();
                ResultSet resultat = statement.executeQuery(requete2);

                while (resultat.next()) {
                    Annonce annonce1 = new Annonce();
                    System.out.println(resultat.getString(1));
                    annonce1.setNom(resultat.getString(1));
//                    annonce1.setId_Annonce(resultat1.getInt(1));
//                    annonce1.setId_Annonceur(resultat1.getInt(2));
//                    annonce1.setNom(resultat1.getString(3));
//                    annonce1.setDate_deb(resultat1.getDate(4));
//                    annonce1.setDate_fin(resultat1.getDate(5));
//                    annonce1.setDepart(resultat1.getString(6));
//                    annonce1.setDestination(resultat1.getString(7));
//                    annonce1.setDescription(resultat1.getString(8));
//                    annonce1.setHebergement(resultat1.getString(9));
//                    annonce1.setType_hebergement(resultat1.getString(10));
//                    annonce1.setType_annonce(resultat1.getString(11));
//                    annonce1.setTransport(resultat1.getString(12));
//                    annonce1.setNote(resultat1.getInt(13));
//                    annonce1.setEtat(resultat1.getInt(14));
//                    annonce1.setNbr_enfants(resultat1.getInt(15));
//                    annonce1.setNbr_adultes(resultat1.getInt(16));
                    listeannonces1.add(annonce1);
                }

            } catch (SQLException ex) {
                //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("erreur lors du chargement des reservations " + ex.getMessage());
                return null;
            }

        }
        return listeannonces1;

    }
    public Annonce DisplayAnnonceByNom(String N) {

       // List<Annonce> listeannonces2 = new ArrayList<Annonce>();
            fiche_reservation f= new fiche_reservation();
            String requete2 = ("select * from Annonce where nom='"+N+"' limit 1");
            Annonce annonce1 = new Annonce();
            
            try {
                Statement statement = MyConnection.getInstance().createStatement();
                ResultSet resultat1 = statement.executeQuery(requete2);
                
                while (resultat1.next()) {
                 //   Annonce annonce1 = new Annonce();
                 
                    annonce1.setId_Annonce(resultat1.getInt(1));
                    annonce1.setId_Annonceur(resultat1.getInt(2));
                    annonce1.setNom(resultat1.getString(3));
                    annonce1.setDate_deb(resultat1.getDate(4));
                    annonce1.setDate_fin(resultat1.getDate(5));
                    annonce1.setDepart(resultat1.getString(6));
                    annonce1.setDestination(resultat1.getString(7));
                    annonce1.setDescription(resultat1.getString(8));
                    annonce1.setHebergement(resultat1.getString(9));
                    annonce1.setType_hebergement(resultat1.getString(10));
                    annonce1.setType_annonce(resultat1.getString(11));
                    annonce1.setTransport(resultat1.getString(12));
                    annonce1.setNote(resultat1.getInt(13));
                    annonce1.setEtat(resultat1.getInt(14));
                    annonce1.setNbr_enfants(resultat1.getInt(15));
                    annonce1.setNbr_adultes(resultat1.getInt(16));
                }
                return annonce1;

            } catch (SQLException ex) {
                //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("erreur lors du chargement des annoncesbynom " + ex.getMessage());
                return null;
            }
        }
        

    }