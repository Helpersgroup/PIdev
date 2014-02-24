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
    
       private String nom;
       private String prenom;
       private String cin;
       private String email;
      int Id_Personne;

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
       
    
   public Personne (String a ,String b,String c,String d)
   {
       a=this.nom;
       b=this.prenom;
       c=this.cin;
       d=this.email;

       
   }
   
}
