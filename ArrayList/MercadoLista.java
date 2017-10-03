package ArrayList;

import java.util.*;
public class MercadoLista
{
	public MercadoLista(String string, int i) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[])
	{
		
		// Definir 5 instancias de la Clase Producto
		MercadoLista pan = new MercadoLista("Pan", 6);
		MercadoLista leche = new MercadoLista("Leche", 2);
		MercadoLista manzanas = new MercadoLista("Manzanas", 5);
		MercadoLista brocoli = new MercadoLista("Brocoli", 2);
		MercadoLista carne = new MercadoLista("Carne", 2); 
		
		// Definir un ArrayList
		ArrayList<MercadoLista> lista = new ArrayList<MercadoLista>(); 
		
		// Colocar Instancias de Producto en ArrayList
		lista.add(pan);		
		lista.add(leche);
		lista.add(manzanas);
		lista.add(brocoli);
		  
		// Indica el indice de insercion
		lista.add(1, carne);
		lista.add(carne); 
		
		// Imprimir contenido de ArrayLists
		
		System.out.println(" Lista del mercado con " + lista.size() +" productos"); 
		
		// Definir Iterator para extraer e imprimir sus valores
		Iterator<MercadoLista> it = lista.iterator();
		while ( it.hasNext() ) {
			Object objeto = it.next();
			MercadoLista producto = (MercadoLista)objeto;
			System.out.println(producto);
			}
		
		// Eliminar elemento de ArrayList
		lista.remove(2);
		System.out.println(" Lista del mercado con " + lista.size() +" productos");
		
		// Definir Iterator para extraer e imprimir valores
		Iterator<MercadoLista> it2 = lista.iterator();
		while ( it2.hasNext() ) {
			MercadoLista producto = (MercadoLista)it2.next();
			System.out.println(producto);} 
		
		// Eliminar todos los valores del ArrayList
		lista.clear();
		
		System.out.println(" Lista del mercado con " + lista.size() +" productos");
		}
	}

