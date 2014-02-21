/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.entities;

/**
 *
 * @author Eya
 */
public enum TypeHebergement {
    VILLA("villa") , HOTEL1("hotel 1"), HOTEL2("hotel 2"), HOTEL3("hotel 3"), HOTEL4("hotel 4"), HOTEL5("hotel 5"), MAISON_HOTES("Maison d'hotes"), BUNGALOW("BunGalow");
    TypeHebergement [] Heberg = TypeHebergement.values();
    private String abreviation ;  
      
     private TypeHebergement (String abreviation) {  
         this.abreviation = abreviation ;  
    }  
      
     public String getAbreviation() {  
         return  this.abreviation ;  
    }  
}
