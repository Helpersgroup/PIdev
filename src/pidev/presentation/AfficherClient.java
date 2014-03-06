/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pidev.presentation;

import java.util.ArrayList;
import java.util.List;
import pidev.dao.UsersDAO;

/**
 *
 * @author Helmi
 */
public class AfficherClient {
  List<pidev.entities.ResponsableAgence> clients =new ArrayList<pidev.entities.ResponsableAgence>();
    String columTab [] = {"Id","cin","nom","prenom","email","tel","mot de passe"};
    
    public AfficherClient () 
    {   UsersDAO cliendao = new UsersDAO();
       clients = cliendao.Affichage_Responsable_Agence();
    }
    public int getRowCount() {
        return clients.size();
    }

    public int getColumnCount() {
    return columTab.length ;
    }

    
    public String getColumnName(int column) {
        return columTab[column] ;
    }
    
    

    public Object getValueAt(int rowIndex, int columnIndex) {
     switch(columnIndex)
     {
         case 0 : return clients.get(rowIndex).getCin();
         case 1 : return clients.get(rowIndex).getNom();
         case 2 : return clients.get(rowIndex).getPrenom();
         case 3 : return clients.get(rowIndex).getEmail();
         case 4 : return clients.get(rowIndex).getTel();
         case 5 : return clients.get(rowIndex).getEtat();
         case 6 : return clients.get(rowIndex).getMdp();
            
    default: return  null ;
     }
     
     }  
}
