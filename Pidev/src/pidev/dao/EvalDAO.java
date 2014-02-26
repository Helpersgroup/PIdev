/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pidev.util.MyConnection;


/**
 *
 * @author unknown
 */
public class EvalDAO {
    
public static   EvalDAO   evalDAO=null;
    


    public void insertCommentaire(String msg,int id_Personne,int id_Annonce){

         String requete = "insert into Commentaire (id_Annonce,id_Personne,message) values (?,?,?)";
        try { 
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id_Annonce);
            ps.setInt(2, id_Personne);
            ps.setString(3,msg);
            ps.executeUpdate();
            System.out.println("insertion c bon");
        } catch (SQLException ex) {
           
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }

}
