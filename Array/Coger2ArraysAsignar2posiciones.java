package Array;
/*
Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array. 

front11({1, 2, 3}, {7, 9, 8}) → {1, 7}
front11({1}, {2}) → {1, 2}
front11({1, 7}, {}) → {1}
 */
public class Coger2ArraysAsignar2posiciones {
	private static int [] numeros1 = {1, 2, 3};
	private static int [] numeros2 = {7, 9, 8};

	public static int[] Coger2ArraysAsignar2posiciones(int[] a, int[] b) {
	    int[] one = new int[1];
	    int[] two = new int[2];
	    if (a.length == 0 && b.length == 0) {
	        return a;
	    }
	    if (a.length >= 1 && b.length == 0) {
	        one[0] = a[0];
	        return one;
	    }
	    if (a.length >= 1 && b.length >= 1) {
	        two[0] = a[0];
	        two[1] = b[0];
	        return two;
	    }
	    if (a.length == 0 && b.length >= 1) {
	        one[0] = b[0];
	        return one;
	    }
	    return a;
	}
		
	public static void main(String[] args) {
		int[] resultado= Coger2ArraysAsignar2posiciones(numeros1,numeros2);
		
		for(int i=0; i < resultado.length; i++){			   
			System.out.print(resultado[i] + " ");
	    }
		}
	}
