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



import java.util.List;
import javax.swing.table.AbstractTableModel;
import pidev.dao.AnnonceDAO;
import pidev.entities.Annonce;

/**
 *
 * @author USER
 */
public class AfficherAnnonce extends AbstractTableModel{

public List <Annonce> annonce;
String [] columTab = {"Nom","Depart","Destination","Date depart","Prix"};
    public AfficherAnnonce() {
        AnnonceDAO annonceDAO = new AnnonceDAO();
        annonce = annonceDAO.DisplayAllAnnonce();

    }


    public int getRowCount() {
       return  annonce.size();
    }

    public int getColumnCount() {
       return columTab.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex)
       {
          case 0 : return annonce.get(rowIndex).getNom();
          case 1 : return annonce.get(rowIndex).getDepart();
          case 2 : return annonce.get(rowIndex).getDestination();
          case 3 : return annonce.get(rowIndex).getDate_deb();
          case 4 : return annonce.get(rowIndex).getPrix();
          default: return null;
       }
    }

    @Override
    public String getColumnName(int column) {
       return  columTab[column];
    }



}
