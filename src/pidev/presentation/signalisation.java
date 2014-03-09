/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pidev.presentation;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import pidev.dao.EvalDAO;
import pidev.dao.UsersDAO;
import pidev.entities.Annonce;
import pidev.entities.Evaluer;

public class signalisation extends AbstractTableModel{
        List<Annonce> evals=new ArrayList<Annonce>() ;
        String columTab [] = {"id","Nom","Nombre"};
        EvalDAO evaldao = new EvalDAO();

    public signalisation() 
        {   
           evals=evaldao.getAnnonce_signaler();
        }
  @Override
    public int getRowCount() {
        return evals.size();
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
         
         case 0 : return evals.get(rowIndex).getId_Annonce();
         case 1 : return evals.get(rowIndex).getNom();
         case 2 : return evals.get(rowIndex).getNbre_signal();
         default: return  null ;
     }
     
     }  
}
