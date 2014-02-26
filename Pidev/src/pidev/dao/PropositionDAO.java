/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import pidev.entities.Annonce;
import pidev.util.MyConnection;

/**
 *
 * @author dell
 */
public class PropositionDAO  {
    
    int id;
     public void ProposerAnnonce(Annonce a){
         
                    String requete = "insert into Annonce (Id_Annonceur,nom,type_Annonce,date_Deb,date_Fin,depart,destination,description,hebergement,type_Hebergement,transport,nbre_adultes,nbre_enfants,etat)"
                            + " values"    + " (36,?,?,?,?,?,?,?,?,?,?,?,?,0)";
        try {
            
            java.util.Date utilDate = a.getDate_deb();  
            java.util.Date utilDate1 = a.getDate_fin();     
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());  
            java.sql.Date sqlDate1 = new java.sql.Date(utilDate1.getTime());

            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
                ps.setString(1,a.getNom());
                ps.setString(2,a.getType_annonce());
                ps.setDate(3,sqlDate);
                ps.setDate(4,sqlDate1);
                ps.setString(5,a.getDepart());
                ps.setString(6,a.getDestination());
                ps.setString(7,a.getDescription());
                ps.setString(8,a.getHebergement());
                ps.setString(9,a.getType_hebergement());
                ps.setString(10,a.getTransport());
                ps.setInt(11,a.getNbr_adultes());
                ps.setInt(12,a.getNbr_enfants());
                
                
                ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    // TODO overwrite start(), stop() and destroy() methods
}
