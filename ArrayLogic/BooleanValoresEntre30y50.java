package ArrayLogic;

public class BooleanValoresEntre30y50 {
	private static int a = 36;
	private static int b = 38;

	public static boolean BooleanValoresEntre30y50(int a,int b) {
		if (a > 30 &&  b < 50) return true;
	    if (a > 50 &&  b < 30) return false;
	    return false;
		}
				
	public static void main(String[] args) {			
			System.out.println("La cadena devuelve : "
					+ BooleanValoresEntre30y50(a,b));
		}
	}
