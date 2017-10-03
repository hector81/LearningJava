package ArrayLogic;
/*
Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky. So if either value is a teen, just return 19. 

teenSum(3, 4) → 7
teenSum(10, 13) → 19
teenSum(13, 2) → 19
 */
public class Suma1319 {
	private static int a = 1;
	private static int b = 3;
	private static int c = 19;

	public static int Suma1319(int a, int b) {
	    if (a >= 13 && a <= 19 || b >= 13 && b <= 19){ return c ;}
	    return  a + b ;
	}
		
		
	public static void main(String[] args) {
			
			System.out.println("La cadena devuelve : "
					+ Suma1319(a,b));
		}
	}

