/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.entities;
import pidev.entities.Transport;
import pidev.entities.TypeHebergement;

/**
 *
 * @author Eya
 */
public class Annonce {
    private String nom;
    private String date_deb;
    private String date_fin;
    private String description;
    private String destination;
    private String depart;
    private String hebergement;
    private int    note;
    private int    nbr_adultes;
    private int    nbr_enfants;
    
    public enum Transport {
    MICRO_BUS,MINI_BUS,BUS,VOITURE,AVION;
    Transport[] transports = Transport.values() ;

    TypeHebergement [] Heberg = TypeHebergement.values();
    
    
    }}