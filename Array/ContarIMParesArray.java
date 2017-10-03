package Array;

public class ContarIMParesArray {
	// ATRIBUTOS
		private static int[] array1 = { 2, 1, 2, 3, 4 };
		
		// METODOs
		public static int ContarParesArray(int array1[]) {
			int max = array1[0];
			int min = array1[0];
			for (int i = 0; i < array1.length; i++) {
			    if (array1[i] > max) max = array1[i];  
			    if (array1[i] <= min) min = array1[i];
			  }
			  return max - min;
			}
		
		// MAIN
		public static void main(String[] args) {
			
			System.out.println("Numeros pares: " + ContarParesArray(array1));
		}
}
