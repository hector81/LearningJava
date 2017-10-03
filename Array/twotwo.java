package Array;
/*

Given an array of ints, return true if every 2 that appears in the array is next to another 2. 

twoTwo({4, 2, 2, 3}) → true
twoTwo({2, 2, 4}) → true
twoTwo({2, 2, 4, 2}) → false
 */
public class twotwo {
	private static int[] numeros = {2,2,4,2};

	public static boolean twoTwo(int[] numeros) {
	    for (int i = 0; i < numeros.length; i++)
	        if (numeros[i] == 2) {
	            int count = 0;
	            for (int j = i; j < numeros.length; j++)
	                if (numeros[j] == 2) count++;
	                else break;
	            i += count;
	            if (count < 2) return false;
	        }
	    return true;
	}
	
public static void main(String[] args) {
		
		System.out.println("La cadena devuelve : "
				+ twoTwo(numeros));
	}
}
