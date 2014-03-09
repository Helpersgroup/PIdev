package pidev.entities;

import java.util.Date;

public class Reservation {

    private int id_Client;
    private int id_Annonce;
    private int etat;
    private Date date;
    private String nomannonce;
    private String nomclient;
    private int tel;
    private String mail;
    
    public Reservation() {
    }

    @Override
    public String toString() {
        return "Reservation{" + "id_Client=" + id_Client + ", id_Annonce=" + id_Annonce + ", etat=" + etat + ", date=" + date + '}';
    }

    /**
     * @return the id_Client
     */
    public int getId_Client() {
        return id_Client;
    }

    /**
     * @param id_Client the id_Client to set
     */
    public void setId_Client(int id_Client) {
        this.id_Client = id_Client;
    }

    /**
     * @return the id_Annonce
     */
    public int getId_Annonce() {
        return id_Annonce;
    }

    /**
     * @param id_Annonce the id_Annonce to set
     */
    public void setId_Annonce(int id_Annonce) {
        this.id_Annonce = id_Annonce;
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
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    public Reservation(int a, int b, int c, Date d) {
        a = this.id_Client;
        b = this.id_Annonce;
        c = this.etat;
        d = this.date;
    }

    /**
     * @return the nom
     */
    public String getNomAnnonce() {
        return nomannonce;
    }

    /**
     * @param nom the nom to set
     */
    public void setNomAnnonce(String nom) {
        this.nomannonce = nom;
    }

    /**
     * @return the nomclient
     */
    public String getNomclient() {
        return nomclient;
    }

    /**
     * @param nomclient the nomclient to set
     */
    public void setNomclient(String nomclient) {
        this.nomclient = nomclient;
    }

    /**
     * @return the tel
     */
    public int getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(int tel) {
        this.tel = tel;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }
}
