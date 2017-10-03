package Array;

//Dado dos valores retorna true si uno es negativo 
//Excetp si el parametro booleano es true, entonces los dos deben ser negativos. 

//posNeg(1, -1, false) → true
//posNeg(-1, 1, false) → true
//posNeg(-4, -5, true) → true

public class posNeg {
	private static String[] numeros = {"-4", "-5", "true"};
	
	
	public static boolean posNeg(String[] numeros) {
            boolean aux= false;
            String uno = numeros[0];
            String dos = numeros[1];
            String tres = numeros[2];
	    if(uno.substring(0,1) != "-" && dos.substring(0,1) == "-" && tres == "false"){
                aux= true;
            }else if(uno.substring(0,1) == "-" && dos.substring(0,1) != "-" && tres == "false"){
                aux= true;
            }else if(uno.substring(0,1) != "-" && dos.substring(0,1) == "-" && tres == "false"){
                aux= true;
            }else if(uno.substring(0,1) == "-" && dos.substring(0,1) == "-" && tres == "true"){
                aux= true;
            }
            return aux;
	}



public static void main(String[] args) {
	
	System.out.println("La cadena devuelve : " + posNeg(numeros));
}
}
