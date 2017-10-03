package club710;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Store details of club memberships.
 * 
 * @author (Hector Garcia Gonzalez)
 * @version (01/05/2015)
 */
public class Club {
	// Define any necessary fields here ...
	//definimos un campo para el array (Membership)
	private ArrayList<Membership> members;	
	/**
	 * Constructor for objects of class Club
	 */
	public Club() {
		// Initialise any fields here ...
		// En el constructor, creamos un objeto y asignarmos el campo Membership
		members = new ArrayList<Membership>();
	}

	/**
	 * Añadimos u nuevo miembro a la lista de miembros del club.
	 * 
	 * @param member
	 */
	public void join(Membership member) {
		members.add(member);
	}

	/**
	 * @return Devuelve el numero de miembros del club (Membership).
	 */
	//Creamos el metodo numberOfMembers para devolver el tamaño actual del array.
	public int numberOfMembers() {
		return members.size();
	}

	/**
	 * Imprime todos los miembros
	 */
	public void print() {
		Iterator<Membership> iter=members.iterator();
		while(iter.hasNext()){
			Membership str=iter.next();
			System.out.println(str);
		}
	}
}