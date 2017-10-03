package Array;
/*
Dadas dos matrices , A y B , de las puntuaciones int no negativos . Una puntuación de "especial" es uno que es un múltiplo de 10 , como 40 o 90. Volver a la suma de la puntuación especial más grande de A y la puntuación especial más grande de B. Para practicar la descomposición, escribir un método de ayuda independiente que se encuentra el mayor puntuación especial en una matriz. Escriba su método de ayuda después de que su método scoresSpecial () en el área de texto JavaBat .

scoresSpecial ({ 12 , 10 , 4 }, { 2 , 20 , 30 } ) → 40
scoresSpecial ({ 20 , 10 , 4 }, { 2 , 20 , 10 } ) → 40
scoresSpecial ({ 12 , 11 , 4 }, { 2 , 20 , 31 } ) → 20
*/
public class SumarMaxPuntos2ArraysMultiplo10 {
	// ATRIBUTOS
	private static int[] array1 = {20 , 10 , 4  };	
	private static int[] array2 = {2 , 20 , 10 };	
	// METODOs
	public static int SumarMaxPuntos2ArraysMultiplo10(int[] array1,int[] array2) {
		int contador = 0;
		int contador1 = 0;
		int contador2 = 0;
		for (int i = 0; i < array1.length; i++){
		    if (array1[i]%10 == 0 && array1[i]%10 > 0 ) 
		        	return array1[i]=contador1;
		}
		for (int j = 0; j < array2.length; j++){
			if (array2[j]%10 == 0 && array1[j]%10 > 0) 
					return array2[j]=contador2;
		}
		    return contador = contador1 + contador2;
		}
	// MAIN
	public static void main(String[] args) {
		System.out.println("cadena : " + SumarMaxPuntos2ArraysMultiplo10(array1,array2));
	}
	
}
	/*
	public int scoresSpecial(int[] a, int[] b) {
	    return largest(a) + largest(b);
	}
	 
	 
	public int largest(int[] array) {
	    int result = 0;
	    for (int i = 0; i < array.length; i++)
	        if (array[i] % 10 == 0 && array[i] > result)
	            result = array[i];
	    return result;
	}
}
*/