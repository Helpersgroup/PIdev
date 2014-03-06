/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pidev.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import pidev.entities.*;
//import pidev.presentation.*;
import pidev.util.MyConnection;

/**
 *
 * @author Helmi
 */
public class UsersDAO {
    
      public List<Client> Affichage_Client (){
          
        List<Client> listeclients = new ArrayList<Client>();

        String req  = "select * from Client C, Personne P where P.id_Personne=C.id_Client ";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(req);

            while(resultat.next()){
                Client client =new Client();
                client.setId_client(resultat.getInt(1));
                client.setCin(resultat.getString(2));
                client.setNom(resultat.getString(3));
                client.setPrenom(resultat.getString(4));
                client.setEmail(resultat.getString(5));
                client.setTel(resultat.getInt(6));
                client.setEtat(resultat.getInt(7));
                client.setMdp(resultat.getString(8));
                
                listeclients.add(client);
            }
            return listeclients;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des clients "+ex.getMessage());
            return null;
        }
    }

      public List<ResponsableAgence> Affichage_Responsable_Agence (){


        List<ResponsableAgence> listeresponsableAgences = new ArrayList<ResponsableAgence>();

        String requete = "select * from ResponsableAgence R,Personne P where P.id_Personne=R.id_Responsable  ";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                ResponsableAgence responsableAgence =new ResponsableAgence();
                
                responsableAgence.setId_Responsable(resultat.getInt(1));
                responsableAgence.setId_Responsable(resultat.getInt(2));
                responsableAgence.setCin(resultat.getString(4));
                responsableAgence.setNom(resultat.getString(5));
                responsableAgence.setPrenom(resultat.getString(6));
                responsableAgence.setEmail(resultat.getString(7));
                responsableAgence.setTel(resultat.getInt(8));
                responsableAgence.setEtat(resultat.getInt(9));
                responsableAgence.setMdp(resultat.getString(11));
                
                 listeresponsableAgences.add(responsableAgence);
            }
            return  listeresponsableAgences;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des responsables "+ex.getMessage());
            return null;
        }
    }
 public void suppression_client(Client C){
        String requete = "delete from client where id=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, C.getId_Client());
            ps.executeUpdate();
            System.out.println("Client supprimé");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
         public List<Client> Recherche_client(String nom ){
     
            String requete = "select * from Client C,Personne P where nom='"+nom+"' and P.id_Personne=C.id_Client ";
               try {
                   Statement ps = MyConnection.getInstance()
                          .createStatement();
                   ResultSet resultat = ps.executeQuery(requete);
            List<Client> listeclients = new ArrayList<Client>();
            
            while (resultat.next())
            {
                Client client =new Client();
                client.setId_client(resultat.getInt(1));
                client.setCin(resultat.getString(2));
                client.setNom(resultat.getString(3));
                client.setPrenom(resultat.getString(4));
                client.setEmail(resultat.getString(5));
                client.setTel(resultat.getInt(6));
                client.setEtat(resultat.getInt(7));
                client.setMdp(resultat.getString(8));
                
                listeclients.add(client);
            }
            return listeclients;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche "+ex.getMessage());
            return null;
        }
    }

         public List<ResponsableAgence> Recherche_Agent(String nom ){
     
            String requete = "select * from ResponsableAgence R,Personne P where nom='"+nom+"' and P.id_Personne=R.id_Responsable ";
               try {
                   Statement ps = MyConnection.getInstance()
                          .createStatement();
                   ResultSet resultat = ps.executeQuery(requete);
            List<ResponsableAgence> listeclients = new ArrayList<ResponsableAgence>();
            
            while (resultat.next())
            {
                ResponsableAgence responsableAgence =new ResponsableAgence();
                responsableAgence .setId_Responsable(resultat.getInt(1));
                responsableAgence .setCin(resultat.getString(2));
                responsableAgence .setNom(resultat.getString(3));
                responsableAgence .setPrenom(resultat.getString(4));
                responsableAgence .setEmail(resultat.getString(5));
                responsableAgence .setTel(resultat.getInt(6));
                responsableAgence .setEtat(resultat.getInt(7));
                responsableAgence .setMdp(resultat.getString(8));
                
                listeclients.add(responsableAgence );
            }
            return listeclients;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche "+ex.getMessage());
            return null;
        }
    }
          public Agence Recherche_AgenceByID (int id_Agence){

          Agence agence=new Agence();

        String requete = "select * from Agence where id_Agence="+id_Agence;
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                ResponsableAgence responsableAgence =new ResponsableAgence();
                
                agence.setNom(resultat.getString(2));
                agence.setAdresse(resultat.getString(3));
                agence.setTelephone(resultat.getInt(4));
                agence.setVille(resultat.getString(5));
                   
            }
            return  agence ;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des responsables "+ex.getMessage());
            return null;
        }
    }
}
