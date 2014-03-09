/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pidev.presentation;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import pidev.dao.UsersDAO;
import pidev.entities.Client;
import pidev.entities.Personne;

/**
 *
 * @author Helmi
 */
public class AfficherClient extends AbstractTableModel{
        List<Personne> personnes ;
        String columTab [] = {"cin","nom","prenom","email","tel","etat","mot de passe"};
        UsersDAO cliendao = new UsersDAO();    
        public AfficherClient() 
        {   
           personnes = cliendao.Affichage_Client();
            
        }
  @Override
    public int getRowCount() {
        return personnes.size();
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
         case 0 : return personnes.get(rowIndex).getCin();
         case 1 : return personnes.get(rowIndex).getNom();
         case 2 : return personnes.get(rowIndex).getPrenom();
         case 3 : return personnes.get(rowIndex).getEmail();
         case 4 : return personnes.get(rowIndex).getTel();
         case 5 : return personnes.get(rowIndex).getEtat();
         case 6 : return personnes.get(rowIndex).getMdp();
            
    default: return  null ;
     }
     
     }  
}
