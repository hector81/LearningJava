package Array;

//Dada una matriz de enteros , es posible dividir los enteros en dos grupos , de modo que la 
//suma de los dos grupos son los mismos. Cada int debe estar en un grupo u otro. Escribir un 
//método de ayuda recursiva que toma cualquier argumentos que te gusta, y hacer la llamada
//inicial a su ayudante recursiva de splitArray (). ( No hay bucles necesarios . )

//splitArray ({ 2 , 2 } ) → verdad
//splitArray ({ 2 , 3 } ) → falsa
//splitArray ({ 5 , 2 , 3 } ) → verdadera

public class splitArray {
	//ATRIBUTOS
		public static int[] numeros = {2 , 2};
	//METODOS
	public static boolean splitArray(int[] numeros) {
	    return helper(0, numeros, 0, 0);
	}
	 
	private static boolean helper(int start, int[] numeros, int sum1, int sum2) {
	    if (start >= numeros.length) return sum1 == sum2;
	    return helper(start + 1, numeros, sum1 + numeros[start], sum2)
	            || helper(start + 1, numeros, sum1, sum2 + numeros[start]);
	}
	//MAIN
	public static void main(String[] args) {		   
		System.out.print(splitArray(numeros));
	}
}
