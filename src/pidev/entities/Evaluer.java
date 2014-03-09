/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.entities;

/**
 *
 * @author Eya
 */
public class Evaluer {
    private int id_personne;
    private int id_annonce;
    private String message;
    private String date;
    private String nom;
    private int nb_signal;
    
    public Evaluer(){
    
    
    
    }

    /**
     * @return the id_personne
     */
    public int getId_personne() {
        return id_personne;
    }

    /**
     * @param id_personne the id_personne to set
     */
    public void setId_personne(int id_personne) {
        this.id_personne = id_personne;
    }

    /**
     * @return the id_annonce
     */
    public int getId_annonce() {
        return id_annonce;
    }

    /**
     * @param id_annonce the id_annonce to set
     */
    public void setId_annonce(int id_annonce) {
        this.id_annonce = id_annonce;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the nb_signal
     */
    public int getNb_signal() {
        return nb_signal;
    }

    /**
     * @param nb_signal the nb_signal to set
     */
    public void setNb_signal(int nb_signal) {
        this.nb_signal = nb_signal;
    }
}
