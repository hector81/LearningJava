package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ResumenMetodos {
	public static void main(String[] args) {
	//declaro elemento lst
		List<String> lst = new ArrayList<String>(); // Inform compiler about the type
		//añado elementos
		lst.add("alpha"); // compiler checks if argument´s type is String
		lst.add("beta");
		lst.add("charlie");
	
		
		//Obtener elemento de un ArrayList
		Iterator<String> it = lst.iterator();
		 
		while(it.hasNext())
		  System.out.println(it.next());
		
		//Reemplazar un elemento del ArrayList
		lst.set(2,"Teresa");
		
		//Eliminar todos los elementos de un ArrayList
		lst.clear();
		
		//borrar un elemento
		lst.remove(1);
}
}

//http://lineadecodigo.com/tag/java-collection-arraylist/