package pidev.presentation;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import pidev.dao.*;
import pidev.entities.Annonce;

public class Test extends AbstractTableModel {

    ReservationDAO r = new ReservationDAO();
    List<Annonce> listeAnnonces = r.DisplayAnnonceByReservation();
    String[] columTab = {"Vos Reservations"};

    public Test() {
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
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columTab[column];
    }
}