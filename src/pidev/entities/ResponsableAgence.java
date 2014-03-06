/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.entities;

/**
 *
 * @author Eya
 */
public class ResponsableAgence extends Personne {
    
    
    private int id_Responsable;
    private int id_Agence;
    
    public ResponsableAgence(){
        
      super ();  
        
    }
   public ResponsableAgence (String a ,String b,String c,String d,int e,String h)
   {   this.cin = a;
       this.nom=b;
       this.prenom=c;
       this.email=d;
       this.tel=e;
       this.mdp=h;

       
   }
     public int getId_Responsable() {
        return id_Responsable;
    }

 
    public void setId_Responsable(int Id_Responsable) {
        this.id_Responsable = Id_Responsable;
    }

    /**
     * @return the id_Agence
     */
    public int getId_Agence() {
        return id_Agence;
    }

   
    public void setId_Agence(int id_Agence) {
        this.id_Agence = id_Agence;
    }

   
}
