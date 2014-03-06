/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.entities;

/**
 *
 * @author Eya
 */
public class Client extends Personne {
    private int Id_Client;

    public Client(){
       super();

    }
    
    
    public int getId_Client() {
        return Id_Client;
    }

 
    public void setId_Client(int Id_Client) {
        this.Id_Client = Id_Client;
    }



    public void setId_client(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setAdresse_client(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
