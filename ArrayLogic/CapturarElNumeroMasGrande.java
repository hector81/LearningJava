package ArrayLogic;

public class CapturarElNumeroMasGrande {
	private static int a = 18;
	private static int b = 15;
	private static int c = 37;

	public static int CapturarElNumeroMasGrande(int a,int b,int c) {
		    if (a > b &&  a > c) return a;
		    if (b > a &&  b > c) return b;
		    if (c > b &&  c > a) return c;
		    return 0;
		}
		
		
	public static void main(String[] args) {
			
			System.out.println("La cadena devuelve : "
					+ CapturarElNumeroMasGrande(a,b,c));
		}
	}

