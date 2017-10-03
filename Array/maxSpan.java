package Array;

//Tenga en cuenta los aspectos más a la izquierda y righmost de algún valor en una matriz.
//Diremos que el "span" es el número de elementos entre los dos , ambos inclusive.
//Un solo valor tiene un lapso de 1. Devuelve el palmo más grande encontrado en la matriz dada.
//( La eficiencia no es una prioridad. )

//maxSpan({1, 2, 1, 1, 3}) → 4
//maxSpan({1, 4, 2, 1, 4, 1, 4}) → 6
//maxSpan({1, 4, 2, 1, 4, 4, 4}) → 6

public class maxSpan {
	//ATRIBUTOS
	private static int[] numeros = {1, 4, 2, 1, 4, 1, 4};
	
//metodos
 
	public static int maxSpan(int[] numeros) {
	    if (numeros.length > 0) {
	        int maxSpan = 1;
	        for (int i = 0; i < numeros.length; i++)
	            for (int j = numeros.length - 1; j > i; j--)
	                if (numeros[j] == numeros[i]) {
	                    int count = (j - i) + 1;
	                    if (count > maxSpan) maxSpan = count;
	                    break;
	                }
	        return maxSpan;
	    } else return 0;
	}
	//MAIN
		public static void main(String[] args) {		   
			System.out.print(maxSpan(numeros));
		}
}
