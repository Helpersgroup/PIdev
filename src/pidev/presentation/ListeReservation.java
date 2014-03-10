/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pidev.presentation;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import pidev.dao.PropositionDAO;
import pidev.dao.ReservationDAO;
import pidev.entities.Annonce;
import pidev.entities.Reservation;

/**
 *
 * @author pikon
 */
public class ListeReservation extends AbstractTableModel {
    List<Reservation> reservation =new ArrayList<Reservation>();
    ReservationDAO  r = new ReservationDAO();
    String[] columTab = {"Nom Annonce","Nom Client","Mail","date"};

    public ListeReservation(int id_annonce) {
        reservation=r.DisplayReservationbyAnnonce(id_annonce);
    }

    @Override
    public int getRowCount() {
        return reservation.size();
    }

    @Override
    public int getColumnCount() {
        return columTab.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return reservation.get(rowIndex).getNomAnnonce();
                   case 1:
                return reservation.get(rowIndex).getNomclient();
                       case 2:
                return reservation.get(rowIndex).getMail();
            case 3:
                return reservation.get(rowIndex).getDate();
                   default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columTab[column];
    }
}
