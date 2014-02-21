/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.entities;
import pidev.entities.Transport;
import java.util.EnumSet;
import java.util.HashSet;

/**
 *
 * @author Eya
 */
public abstract class TransportSet {
    EnumSet <Transport> transports = EnumSet.allOf(Transport.class) ;
public TransportSet() {
		Transports = new HashSet<Transport>();
	}
}
