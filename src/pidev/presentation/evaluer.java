/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pidev.presentation;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import pidev.dao.EvalDAO;
import static pidev.dao.EvalDAO.evalDAO;
import pidev.dao.UsersDAO;
import pidev.entities.Evaluer;

/**
 *
 * @author unknown
 */
public class evaluer extends AbstractTableModel{
        List<Evaluer> eval ;
        String columTab [] = {"nom","Message","date"};
        EvalDAO evaldao=new EvalDAO();

    /**
     *
     */
    public evaluer(int i) 
        {   
           eval = evaldao.getCommentaire(i);
        }
  @Override
    public int getRowCount() {
        return eval.size();
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
         
         case 0 : return eval.get(rowIndex).getNom();
         case 1 : return eval.get(rowIndex).getMessage();
         //case 2 : return eval.get(rowIndex).get
         
            
    default: return  null ;
     }
     
     }  
}
