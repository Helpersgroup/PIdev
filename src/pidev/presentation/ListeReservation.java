/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pidev.presentation;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import pidev.dao.PropositionDAO;
import pidev.dao.ReservationDAO;
import pidev.entities.Annonce;

/**
 *
 * @author pikon
 */
public class ListeReservation extends AbstractTableModel {

    PropositionDAO  r = new PropositionDAO();
    List<Annonce> listeAnnonces = r.DisplayAnnoncesByIdEtNom("azzouzz i7Eb achouek" ,23);
    String[] columTab = {"nom","id"};

    public ListeReservation() {
//ReservationDAO r = new ReservationDAO();
//List<Annonce> listeAnnonces = r.DisplayAnnonceByReservation();
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
                   case 1:
                return listeAnnonces.get(rowIndex).getId_Annonce();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columTab[column];
    }
}
