/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.dao;
import pidev.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import pidev.entities.Annonce;
/**
 *
 * @author Eya
 */
public class AnnonceDAO {

     public void InsertAnnonce(Annonce a){
         
        String requete = "insert into annonce (Id_Annonceur,nom,date_deb,date_fin,destination,description,hebergement,type_hebergement,transport,type_annonce,note,depart) values ("+12+",?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
                ps.setString(1,a.getNom());
                ps.setDate  (2,a.getDate_deb());
                ps.setDate  (3,a.getDate_fin());
                ps.setString(4,a.getDestination());
                ps.setString(5,a.getDescription());
                ps.setString(6,a.getHebergement());
                ps.setString(7,a.getType_hebergement());
                ps.setString(8,a.getTransport());
                ps.setString(9,a.getType_annonce());
                ps.setInt   (10,a.getNote());
                ps.setString(11,a.getDepart());
                ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
                             
    public List<Annonce> DisplayAllAnnonces (){


        List<Annonce> listeannonces = new ArrayList<Annonce>();

        String requete = "select * from annonce";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Annonce annonce =new Annonce();
                annonce.setId_Annonce(resultat.getInt(0));
                annonce.setId_Annonceur(resultat.getInt(1));
                annonce.setDate_deb(resultat.getDate(2));

                listeannonces.add(annonce);
            }
            return listeannonces;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }
}
