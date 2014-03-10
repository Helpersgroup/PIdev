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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pidev.entities.Annonce;
import pidev.entities.Reservation;
import pidev.presentation.Authentification;
import pidev.presentation.GraphReaderExample;
import pidev.presentation.fiche_reservation;
import pidev.util.*;

public class ReservationDAO {
static int id_CC =Authentification.id_connecté_normal; 

    public List<Reservation> DisplayReservationByClient(int id) {


        List<Reservation> listereservations = new ArrayList<Reservation>();
        
        String requete1 = ("select * from reservation R,Annonce A where A.id_Annonce=R.id_Annonce and R.id_Client="+id);
        try {
            Statement statement1 = MyConnection.getInstance()
                    .createStatement();
            ResultSet resultat1 = statement1.executeQuery(requete1);

            while (resultat1.next()) {
                //Reservation res = new Reservation(resultat1.getInt(1), resultat1.getInt(2), resultat1.getInt(3), resultat1.getDate(4));
                Reservation reservation = new Reservation();
                reservation.setId_Reservation(resultat1.getInt(1));
                reservation.setDate(resultat1.getDate(5));
                reservation.setNomAnnonce(resultat1.getString(8));
                
                listereservations.add(reservation);
            }
            return listereservations;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des annonces " + ex.getMessage());
            return null;
        }
    }

    public List<Reservation> DisplayReservationbyAnnonce(int id_Annonce) {

        List<Reservation> listeannonces1 = new ArrayList<Reservation>();
        
            String requete2 = ("select R.id_reservation,P.nom,A.nom,P.email,R.date,R.etat from reservation R,Annonce A,Personne P where P.id_Personne=R.id_Client and A.id_Annonce="+id_Annonce);
            
            try {
                Statement statement = MyConnection.getInstance().createStatement();
                ResultSet resultat = statement.executeQuery(requete2);

                while (resultat.next()) {
                    Reservation res = new Reservation();
                    res.setId_Reservation(resultat.getInt(1));
                    res.setNomclient(resultat.getString(2));
                    res.setNomAnnonce(resultat.getString(3));
                    
                    res.setMail(resultat.getString(4));
                    res.setDate(resultat.getDate(5));
                    res.setEtat(resultat.getInt(6));
                    listeannonces1.add(res);
                }
                    return listeannonces1;

            } catch (SQLException ex) {
                //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("erreur lors du chargement des reservations " + ex.getMessage());
               
            }

        return null;
       

    }
   
 public void valider_reserver(int id){
            
 
               
         String requete = "update reservation set etat = ? where id_reservation="+id;
        
         try { 
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1,1 );
            ps.executeUpdate();
            System.out.println("valider c bon");
        } catch (SQLException ex) {
           
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }   
 
        public boolean reserver(int id_annonce,int id_client){
             
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = new Date();
        String requete = "insert into reservation (id_Client,id_Annonce,etat,date)"
                + " values" + " (?,?,0,?)";
        try {
            
          
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id_client);
            ps.setInt(2, id_annonce);
            ps.setString(3, dateFormat.format(date));

            ps.executeUpdate();
            System.out.println("reservation effectuée avec succès");
            return true;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
            return false;
        }
 
        }

    }
