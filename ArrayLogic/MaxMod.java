package ArrayLogic;
/*

Given two int values, return whichever value is larger. However if the two values have 
the same remainder when divided by 5, then the return the smaller value. However,
 in all cases, if the two values are the same, return 0. Note: the % "mod" operator 
 computes the remainder, e.g. 7 % 5 is 2. 

maxMod5(2, 3) → 3
maxMod5(6, 2) → 6
maxMod5(3, 2) → 3
maxMod5(3, 3) → 0
 */
public class MaxMod {
	private static int a = 3;
	private static int b = 3;

	public static int MaxMod(int a, int b) {
		if (a == b) return 0;
	    if (a < b) return  b;
	     return  a;
	}
		
		
	public static void main(String[] args) {
			
			System.out.println("La cadena devuelve : "
					+ MaxMod(a,b));
		}
	}
