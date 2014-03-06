/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.presentation;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import pidev.dao.AnnonceDAO;
import pidev.entities.Annonce;



/**
 *
 * @author Eya
 */
public class Affiche_Annonce_Responsable extends AbstractTableModel{
     public List <Annonce> annonces ;
     String [] columTab = {"id","Nom","theme","Destination","Date depart","Date de retour"};
     AnnonceDAO aDAO = new AnnonceDAO();
     public Affiche_Annonce_Responsable(){
         System.out.println("---");
     }
  public Affiche_Annonce_Responsable(int id_Responsable){
         
         annonces=aDAO.DisplayAllAnnonceResp(id_Responsable);
        
     }
     
     

    @Override
    public int getRowCount() {
        return annonces.size();
    }

    @Override
    public int getColumnCount() {
        return columTab.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
       {
          case 0 : return annonces.get(rowIndex).getId_Annonce();
          case 1 : return annonces.get(rowIndex).getNom();
          case 2 : return annonces.get(rowIndex).getType_Annonce();
          case 3 : return annonces.get(rowIndex).getDestination();
          case 4 : return annonces.get(rowIndex).getDate_deb();
          case 5 : return annonces.get(rowIndex).getDate_fin();
          default: return null;
       }
    
    }
    
}
