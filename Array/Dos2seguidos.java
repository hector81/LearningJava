package Array;
//Given an array of ints, return true if every 2 that appears in the array is next to another 2. 

//twoTwo({4, 2, 2, 3}) → true
//twoTwo({2, 2, 4}) → true
//twoTwo({2, 2, 4, 2}) → false

public class Dos2seguidos {
	// ATRIBUTOS
	private static int[] array1 = {2, 4, 2, 2, 3 };	
	// METODOs
	public static boolean Dos2seguidos(int[] array1) {
		 for (int i = 0; i < array1.length; i++)
		        if (array1[i] == 2) {
		            int count = 0;
		            for (int j = i; j < array1.length; j++)
		                if (array1[j] == 2) count++;
		                else break;
		            i += count;
		            if (count < 2) return false;
		        }
		    return true;
		}
	// MAIN
	public static void main(String[] args) {
		System.out.println("cadena : " + Dos2seguidos(array1));
	}
}