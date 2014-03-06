import java.util.ArrayList;
import java.util.List;
import pidev.dao.UsersDAO;
import pidev.entities.ResponsableAgence;

/**
 *
 * @author Helmi
 */
public class AfficherAgent {
  List<ResponsableAgence> agents =new ArrayList<ResponsableAgence>();
    String columTab [] = {"Id","cin","nom","prenom","email","tel","mot de passe"};
    
    public AfficherAgent () 
    {   UsersDAO usersdao = new UsersDAO();
       agents = usersdao.Affichage_Responsable_Agence();
    }
    public int getRowCount() {
        return agents.size();
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
         case 0 : return agents.get(rowIndex).getCin();
         case 1 : return agents.get(rowIndex).getNom();
         case 2 : return agents.get(rowIndex).getPrenom();
         case 3 : return agents.get(rowIndex).getEmail();
         case 4 : return agents.get(rowIndex).getTel();
         case 5 : return agents.get(rowIndex).getEtat();
         case 6 : return agents.get(rowIndex).getMdp();
            
    default: return  null ;
     }
     
     }
       
}
