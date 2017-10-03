package ArrayLogic;
/*Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21. 

diff21(19) → 2
diff21(10) → 11
diff21(21) → 0*/
public class DiferenciaCon21 {
private static int numero = 16;
private static int suma = 0;	
	public static int DiferenciaCon21(int numero) {
	    suma = numero - 21; 
	    return suma*-1;
	}
	/*if (n > 21)
        return 2 * Math.abs(n - 21);
    return Math.abs(n - 21);*/
	//MAIN
			public static void main(String[] args) {
					   
					System.out.print(DiferenciaCon21(numero));
		        }
}