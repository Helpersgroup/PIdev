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
    public Client(String a1,String b1,String c1,String d1)
    {
        super(a1,b1,c1,d1);
    }

    
    public int getId_Client() {
        return Id_Client;
    }

 
    public void setId_Client(int Id_Client) {
        this.Id_Client = Id_Client;
    }
    
    
}
