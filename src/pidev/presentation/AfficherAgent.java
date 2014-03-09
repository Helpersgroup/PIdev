package pidev.presentation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import pidev.dao.UsersDAO;
import pidev.entities.Agence;
import pidev.entities.Client;
import pidev.entities.Personne;
import pidev.entities.ResponsableAgence;

/**
 *
 * @author Helmi
 */
public class AfficherAgent extends AbstractTableModel{
        List<ResponsableAgence> agents ;
        String columTab [] = {"cin","nom","prenom","email","tel","etat","mot de passe","Nom Agence"};
        UsersDAO agentdao = new UsersDAO();

    /**
     *
     */
    public AfficherAgent() 
        {   
           agents = agentdao.Affichage_Responsable_Agence(); 
        }
  @Override
    public int getRowCount() {
        return agents.size();
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
         
         case 0 : return agents.get(rowIndex).getCin();
         case 1 : return agents.get(rowIndex).getNom();
         case 2 : return agents.get(rowIndex).getPrenom();
         case 3 : return agents.get(rowIndex).getEmail();
         case 4 : return agents.get(rowIndex).getTel();
         case 5 : return agents.get(rowIndex).getEtat();
         case 6 : return agents.get(rowIndex).getMdp();
         case 7 : return agents.get(rowIndex).getNom_Agence();
            
    default: return  null ;
     }
     
     }  
}
