package ArrayLogic;
/*
Dadas 2 enteros no negativos , a y b , vuelven su suma , siempre que la suma tiene el mismo 
número de dígitos como . Si la suma tiene más dígitos que una , simplemente volver a sin b .
sumLimit(2, 3) → 5
sumLimit(8, 3) → 8
sumLimit(8, 1) → 9
 */
public class SumaLimite {
	//ATRIBUTOS
	private static int a = 1;
	private static int b = 5;
	;
	//metodo
		public static int SumaLimite(int numero1, int numero2) {
			String sum = String.valueOf(a + b);
		    String lengthA = String.valueOf(a);
		    return (sum.length() == lengthA.length()) ? a + b : a;
		}
	
	//MAIN
	public static void main(String[] args) {
			   
			System.out.print(SumaLimite(a,b));
        }
}