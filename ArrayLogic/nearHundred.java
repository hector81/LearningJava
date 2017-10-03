package ArrayLogic;


//Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) 
//computes the absolute value of a number. 

//nearHundred(93) → true
//nearHundred(90) → true
//nearHundred(89) → false

public class nearHundred {
	private static int numero = 93;

	public static boolean nearHundred(int numero) {
	    return (Math.abs(100 - numero) <= 10 || Math.abs(200 - numero) <= 10);
	}
	
	public static void main(String[] args) {
		
		System.out.println("La cadena devuelve : "
				+ nearHundred(numero));
	}
}
