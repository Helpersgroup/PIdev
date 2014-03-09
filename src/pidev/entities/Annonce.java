/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.entities;

//import java.sql.Date;
import java.util.Date;
import pidev.entities.Transport;
import pidev.entities.TypeHebergement;
/**
 *
 * @author Eya
 */
public class Annonce {
    private int Id_Annonce;
    private int Id_Annonceur;
    private String  nom;
    private Date     date_Deb;
    private Date    date_Fin;
    private String  description;
    private String  destination;
    private String  depart;
    private String  hebergement;
    private int     note;
    private int     etat;
    private int     nbr_adultes;
    private int     nbr_enfants;
    private String  transport;
    private String  type_Hebergement;
    private String  type_Annonce ;
    private double  prix ;
    private String  theme ;
    private int nbre_signal;

    

    public String getType_annonce() {
        return getType_Annonce();
    }

    public void setType_annonce(String type_annonce) {
       this.type_Annonce=type_annonce;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getType_hebergement() {
        return getType_Hebergement();
    }

    public void setType_hebergement(String type_hebergement) {
        this.type_Hebergement=type_hebergement;
    }


   

   // private String [] transports = new String [5];

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDate_deb() {
        return getDate_Deb();
    }

    public void setDate_deb(Date date_deb) {
        this.setDate_Deb(date_deb);
    }

    public Date getDate_fin() {
        return getDate_Fin();
    }

    public void setDate_fin( Date date_fin) {
        this.setDate_Fin(date_fin);
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

    /**
     * @return the Id_Annonce
     */
    public int getId_Annonce() {
        return Id_Annonce;
    }

    /**
     * @param Id_Annonce the Id_Annonce to set
     */
    public void setId_Annonce(int Id_Annonce) {
        this.Id_Annonce = Id_Annonce;
    }

    /**
     * @return the Id_Annonceur
     */
    public int getId_Annonceur() {
        return Id_Annonceur;
    }

    /**
     * @param Id_Annonceur the Id_Annonceur to set
     */
    public void setId_Annonceur(int Id_Annonceur) {
        this.Id_Annonceur = Id_Annonceur;
    }

    public void setDate_deb() {
        
    }

    /**
     * @return the date_Deb
     */
    public Date getDate_Deb() {
        return date_Deb;
    }

    /**
     * @param date_Deb the date_Deb to set
     */
    public void setDate_Deb(Date date_Deb) {
        this.date_Deb = date_Deb;
    }

    /**
     * @return the date_Fin
     */
    public Date getDate_Fin() {
        return date_Fin;
    }

    /**
     * @param date_Fin the date_Fin to set
     */
    public void setDate_Fin(Date date_Fin) {
        this.date_Fin = date_Fin;
    }

    /**
     * @return the etat
     */
    public int getEtat() {
        return etat;
    }

    /**
     * @param etat the etat to set
     */
    public void setEtat(int etat) {
        this.etat = etat;
    }

    /**
     * @return the type_Hebergement
     */
    public String getType_Hebergement() {
        return type_Hebergement;
    }

    /**
     * @param type_Hebergement the type_Hebergement to set
     */
    public void setType_Hebergement(String type_Hebergement) {
        this.type_Hebergement = type_Hebergement;
    }

    /**
     * @return the type_Annonce
     */
    public String getType_Annonce() {
        return type_Annonce;
    }

    /**
     * @param type_Annonce the type_Annonce to set
     */
    public void setType_Annonce(String type_Annonce) {
        this.type_Annonce = type_Annonce;
    }
  public void setPrix(double prix) {
        this.prix = prix;
    }

    /**
     * @return the type_Annonce
     */
    public double getPrix() {
        return prix;
    }
        public String getTheme() {
        return theme;
    }

    /**
     * @param  the type_Hebergement to set
     */
    public void setTheme(String theme) {
        this.theme = theme;
    }

    /**
     * @return the nbre_signal
     */
    public int getNbre_signal() {
        return nbre_signal;
    }

    /**
     * @param nbre_signal the nbre_signal to set
     */
    public void setNbre_signal(int nbre_signal) {
        this.nbre_signal = nbre_signal;
    }
    
    public enum Type_Hebergement {
    Villa,Hotel1,Hotel2,Hotel3,Hotel4,Hotel5;
    }
     
    }

 
