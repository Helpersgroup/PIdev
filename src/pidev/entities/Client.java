
package pidev.entities;


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
}
