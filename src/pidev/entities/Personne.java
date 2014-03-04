/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.entities;

/**
 *
 * @author Eya
 */
public class Personne {
       private String cin;
       private String nom;
       private String prenom;
       
       private String email;


       private int tel;
       private int etat;
       private long id_RS;
       private String mdp;
       
      int Id_Personne;

          public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public long getId_RS() {
        return id_RS;
    }

    public void setId_RS(long id_RS) {
        this.id_RS = id_RS;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public int getId_Personne() {
        return Id_Personne;
    }

    public void setId_Personne(int Id_Personne) {
        this.Id_Personne = Id_Personne;
    }
    public String getNom() {
        return nom;
    }

    
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

   
    public String getCin() {
        return cin;
    }


    public void setCin(String cin) {
        this.cin = cin;
    }

    
    public String getEmail() {
        return email;
    }

   
    public void setEmail(String email) {
        this.email = email;
    }
       
    
   public Personne (String a ,String b,String c,String d,int e,String h)
   {   this.cin = a;
       this.nom=b;
       this.prenom=c;
       this.email=d;
       this.tel=e;
      
       this.mdp=h;

       
   }
   
}
