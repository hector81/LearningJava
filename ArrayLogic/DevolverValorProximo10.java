package ArrayLogic;
/*

Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number. 

close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
*/
public class DevolverValorProximo10 {
	private static int a = 18;
	private static int b = 15;

	public static int CapturarElNumeroMasGrande(int a,int b) {
		if (Math.abs(10 - a) == Math.abs(10 - b)) return 0;
	    if (Math.abs(10 - a) < Math.abs(10 - b)) return a;
	    return b;
		}
		
		
	public static void main(String[] args) {
			
			System.out.println("La cadena devuelve : "
					+ CapturarElNumeroMasGrande(a,b));
		}
	}
