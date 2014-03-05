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
     List <Annonce> annonces ;
     String [] columTab = {"Nom","theme","Destination","Date depart","Date de retour"};
     public Affiche_Annonce_Responsable(){
         AnnonceDAO aDAO = new AnnonceDAO();
         annonces=aDAO.DisplayAllAnnonce();
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
          case 0 : return annonces.get(rowIndex).getNom();
          case 1 : return annonces.get(rowIndex).getType_Annonce();
          case 2 : return annonces.get(rowIndex).getDestination();
          case 3 : return annonces.get(rowIndex).getDate_deb();
          case 4 : return annonces.get(rowIndex).getDate_fin();
          default: return null;
       }
    
    }
    
}
