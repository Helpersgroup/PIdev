/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.entities;

/**
 *
 * @author Eya
 */
 public class Agence {


    
   private String nom;
   private String adresse;
   private int telephone;
  private  String ville;
  
  
    public Agence(){
       super();

    }
    
  public Agence(String a,String b,int c,String d){
      
      
      this.nom=a;
      this.adresse = b;
      this.telephone = c;
      this.ville = d;
  }

  
      public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }  

   
}
