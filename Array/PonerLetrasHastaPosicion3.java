package Array;

import java.util.ArrayList;

/*

Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length. 

wordsFront({"a", "b", "c", "d"}, 1) → {"a"}
wordsFront({"a", "b", "c", "d"}, 2) → {"a", "b"}
wordsFront({"a", "b", "c", "d"}, 3) → {"a", "b", "c"}
 */
public class PonerLetrasHastaPosicion3 {
	private static String[]letras1  = {"a", "b", "b", "c"};
	private static int numero = 3;
	
	public static  String[] PonerLetrasHastaPosicion3(String[]letras1,int numero) {
		String[] resultado = new String[numero];
	    for (int i = 0; i < numero; i++) {
	    	resultado[i] = letras1[i];
	        	}
	        	return resultado;
	         
	}
	public static void main(String[] args) {
		String[] resultado= PonerLetrasHastaPosicion3(letras1,numero);
		
		for(int i=0; i < resultado.length; i++){			   
			System.out.print(resultado[i] + " ");
        }
	    }		
		
	}
