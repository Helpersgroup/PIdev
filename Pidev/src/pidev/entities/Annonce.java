/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.entities;

import java.sql.Date;
//import java.util.Date;
import pidev.entities.Transport;
import pidev.entities.TypeHebergement;

/**
 *
 * @author Eya
 */
public class Annonce {
    private String  nom;
    private Date    date_deb;
    private Date    date_fin;
    private String  description;
    private String  destination;
    private String  depart;
    private String  hebergement;
    private int     note;
    private int     nbr_adultes;
    private int     nbr_enfants;
    private String  transport;
    private String  type_hebergement;
    private String  type_annonce ;

    public String getType_annonce() {
        return type_annonce;
    }

    public void setType_annonce(String type_annonce) {
        this.type_annonce = type_annonce;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getType_hebergement() {
        return type_hebergement;
    }

    public void setType_hebergement(String type_hebergement) {
        this.type_hebergement = type_hebergement;
    }


   

   // private String [] transports = new String [5];

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDate_deb() {
        return date_deb;
    }

    public void setDate_deb(Date date_deb) {
        this.date_deb = date_deb;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getHebergement() {
        return hebergement;
    }

    public void setHebergement(String hebergement) {
        this.hebergement = hebergement;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public int getNbr_adultes() {
        return nbr_adultes;
    }

    public void setNbr_adultes(int nbr_adultes) {
        this.nbr_adultes = nbr_adultes;
    }

    public int getNbr_enfants() {
        return nbr_enfants;
    }

    public void setNbr_enfants(int nbr_enfants) {
        this.nbr_enfants = nbr_enfants;
    }

    
    
    public enum Type_hebergement {
    Villa,Hotel1,Hotel2,Hotel3,Hotel4,Hotel5;
    }
     
    }

 
