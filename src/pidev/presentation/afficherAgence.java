/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pidev.presentation;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import pidev.dao.AgenceDAO;
import pidev.entities.Agence;

/**
 *
 * @author unknown
 */
public class afficherAgence extends AbstractTableModel{
    AgenceDAO agenceDAO=new AgenceDAO();
    List<Agence> agences=new ArrayList<Agence>();
   String columTab [] = {"Nom ","Adresse","telephone","ville"};
    public afficherAgence(){
      
      agences=agenceDAO.afficher_Agence();
    }
    
    
  @Override
    public int getRowCount() {
        return agences.size();
    }
  @Override
    public int getColumnCount() {
    return columTab.length ;
    }

    
  @Override
    public String getColumnName(int column) {
        return columTab[column] ;
    }
    
    

  @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
     switch(columnIndex)
     {
         case 0 : return agences.get(rowIndex).getNom();
         case 1 : return agences.get(rowIndex).getAdresse();
         case 2 : return agences.get(rowIndex).getTelephone();
         case 3 : return agences.get(rowIndex).getVille();
       
            
    default: return  null ;
     }
     
     }  
}