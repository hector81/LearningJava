package Array;

public class Contiene1o3 {
	// ATRIBUTOS
	private static int[] array1 = { 2, 1, 2, 3, 4 };
	
	// METODOs
	public static boolean Contiene1o3(int array1[]) {
		for (int i = 0; i < array1.length; i++) {
		    if (array1[i] == 1 || array1[i] == 3)
		    	return false;	}	    		  
		return true; 			
		}
	
	// MAIN
	public static void main(String[] args) {
		
		System.out.println("cadena : " + Contiene1o3(array1));
	}
}