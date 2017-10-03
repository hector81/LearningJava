package ArrayLogic;
/*

*/
public class UnValorCiertoEntre13y19 {
	private static int a = 16;
	private static int b = 38;

	public static boolean BooleanValoresEntre30y50(int a,int b) {
		if ((a >= 13 & a <= 19) || (b >= 13 && b <= 19))  return true;
	    return false;
		}
				
	public static void main(String[] args) {			
			System.out.println("La cadena devuelve : "
					+ BooleanValoresEntre30y50(a,b));
		}
	}
