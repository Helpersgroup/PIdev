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
public class Liste_Proposition extends AbstractTableModel {

    PropositionDAO  r = new PropositionDAO();
    List<Annonce> listeprop;
    String[] columTab = {"Id","Nom"};

    public Liste_Proposition() {
        listeprop=r.DisplayProposition();
    }

    @Override
    public int getRowCount() {
        return listeprop.size();
    }

    @Override
    public int getColumnCount() {
        return columTab.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listeprop.get(rowIndex).getId_Annonce();

                
                   case 1:
                return listeprop.get(rowIndex).getNom();
                   default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columTab[column];
    }
}
