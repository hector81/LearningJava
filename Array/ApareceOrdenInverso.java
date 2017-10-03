package Array;

//Diremos que una sección de "espejo" en una matriz es un grupo de elementos contiguos 
//tales que en alguna parte de la matriz , el mismo grupo aparece en el orden inverso.
//Por ejemplo , la sección más grande de espejo { 1 , 2 , 3 , 8 , 9 , 3 , 2 , 1 } es
//la longitud 3 ( {1 , 2 , 3 } parcial) .
//Devolver el tamaño de la sección espejo más grande que se encuentra en la matriz dada.

//maxMirror({1, 2, 3, 8, 9, 3, 2, 1}) → 3
//maxMirror({1, 2, 1, 4}) → 3
//maxMirror({7, 1, 2, 9, 7, 2, 1}) → 2

public class ApareceOrdenInverso {
	//ATRIBUTOS
	public static int[] numeros = {7, 1, 2, 9, 7, 2, 1};
	//METODOS	
	public static int ContarGruposIntArrays(int[] nums) {
	    int[] numsCopy = new int[nums.length];
	    for (int i = nums.length - 1, j = 0; i >= 0; i--, j++)
	        numsCopy[j] = nums[i];
	 
	    int max = 0;
	 
	    for (int i = 0; i < nums.length; i++) {
	        int count = 0;
	        int pos1 = i;
	        int pos2 = 0;
	        boolean flag = false;
	 
	        while (pos1 < nums.length && pos2 < nums.length) {
	            if (!flag) {
	                if (nums[pos1] != numsCopy[pos2]) pos2++;
	                else {
	                    flag = true;
	                    count = 1;
	                    pos1++;
	                    pos2++;
	                }
	            } else {
	                if (nums[pos1] == numsCopy[pos2]) {
	                    count++;
	                    pos1++;
	                    pos2++;
	                } else {
	                    if (count > max) max = count;
	                    pos1 = i;
	                    flag = false;
	                }
	            }
	            if (count > max) max = count;
	        }
	    }
	    return max;
	}
	//MAIN
		public static void main(String[] args) {		   
			System.out.print(ContarGruposIntArrays(numeros));
		}
}
