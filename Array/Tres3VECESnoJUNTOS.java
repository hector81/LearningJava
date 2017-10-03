package Array;
//Dada una matriz de enteros , devolverá true si el valor de 3 aparece 
//en la matriz exactamente 3 veces, y no del 3 están uno junto al otro .

//haveThree ({ 3 , 1 , 3 , 1 , 3 } ) → verdadera
//haveThree ({ 3 , 1 , 3 , 3 } ) → falsa
//haveThree ({ 3 , 4 , 3 , 3 , 4 } ) → falsa

public class Tres3VECESnoJUNTOS {
		// ATRIBUTOS
		private static int[] array1 = {3 , 1 , 3 , 3 };	
		// METODOs
		public static boolean Tres3VECESnoJUNTOS(int[] array1) {
		    int count = 0;
		    int pos = -2; // in case nums[0] == 3
		 
		    for (int i = 0; i < array1.length; i++) {
		        if (array1[i] == 3) {
		            count++;
		            if (i - pos == 1) return false;
		            pos = i;
		        }
		    }	 
		    return count == 3;
		}
		// MAIN
		public static void main(String[] args) {
			System.out.println("cadena : " + Tres3VECESnoJUNTOS(array1));
		}
	}