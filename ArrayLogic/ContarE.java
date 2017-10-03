package ArrayLogic;
/*

Return true if the given string contains between 1 and 3 'e' chars. 

stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
 */
public class ContarE {
	private static String frase = "Heello";

	public static boolean ContarE(String frase) {
		int contador = 0;
	    for (int i = 0; i < frase.length(); i++) {
	        if (frase.charAt(i) == 'e') contador++;
	        if (contador >= 3 && contador <= 0);
		    return false;
	    }
	    return true;
		}
		
		
	public static void main(String[] args) {
			
			System.out.println("La cadena devuelve : "
					+ ContarE(frase));
		}
	}


/*
public boolean stringE(String str) {
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == 'e') count++;
    }
    return (count >= 1 && count <= 3);
}

*/
