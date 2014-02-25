
package pidev.presentation;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import pidev.dao.AnnonceDAO;
import pidev.entities.Annonce;
import pidev.entities.Client;

public class Test extends AbstractTableModel{

    //String ch ; 
    List<Annonce> listeAnnonces;
   // Covoitureur covoitureur = new Covoitureur();
    String[] columTab = {"Vos Reservations"};

    public Test () {
       // this.ch=ch ;
        AnnonceDAO annonceDAO = new AnnonceDAO();
        listeAnnonces = annonceDAO.DisplayAllAnnonces ();

       
    }

    @Override
    public int getRowCount() {
        return listeAnnonces.size();
    }

    @Override
    public int getColumnCount() {
        return columTab.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listeAnnonces.get(rowIndex).getNom();
           
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columTab[column];
    }
    
}