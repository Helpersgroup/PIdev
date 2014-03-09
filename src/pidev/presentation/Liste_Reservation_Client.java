package pidev.presentation;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import pidev.dao.*;
import pidev.entities.Annonce;
import pidev.entities.Reservation;

public class Liste_Reservation_Client extends AbstractTableModel {

    ReservationDAO r = new ReservationDAO();
    List<Reservation> res;
    String[] columTab = {"Nom Annonce","date","etat"};

    public Liste_Reservation_Client(int id) {
//ReservationDAO r = new ReservationDAO();
    res = r.DisplayReservationByClient(id);
    }

    @Override
    public int getRowCount() {
        return res.size();
    }

    @Override
    public int getColumnCount() {
        return columTab.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return res.get(rowIndex).getNomAnnonce();
            case 1 :  
                return res.get(rowIndex).getDate();
            case 2:    
                return res.get(rowIndex).getEtat();
                
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columTab[column];
    }
}