/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pidev.presentation;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import pidev.dao.AnnonceDAO;
import pidev.entities.Annonce;

/**
 *
 * @author USER
 */
public class AfficherAnnonce extends AbstractTableModel{

public List <Annonce> annonces=new ArrayList<Annonce>();
String [] columTab = {"Id","Nom","Depart","Destination","Date depart","Prix"};
  AnnonceDAO annonceDAO = new AnnonceDAO();  
public AfficherAnnonce() {
        
        annonces = annonceDAO.DisplayAllAnnonce();

    }
public AfficherAnnonce(String var){
        annonces = annonceDAO.rech_annonce(var);
    
}
    public AfficherAnnonce(int min,int max) {
        annonces = annonceDAO.DisplayAllAnnonce(min,max);

    }


    public int getRowCount() {
       return  annonces.size();
    }

    public int getColumnCount() {
       return columTab.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex)
       {
          case 0 : return annonces.get(rowIndex).getId_Annonce();
          case 1 : return annonces.get(rowIndex).getNom();
          case 2 : return annonces.get(rowIndex).getDepart();
          case 3 : return annonces.get(rowIndex).getDestination();
          case 4 : return annonces.get(rowIndex).getDate_deb();
          case 5 : return annonces.get(rowIndex).getPrix();
          default: return null;
       }
    }

    @Override
    public String getColumnName(int column) {
       return  columTab[column];
    }



}
