package Array;

/*Dada una matriz int , devuelve una nueva matriz con el doble de la longitud donde su último elemento es el mismo que la matriz original , y todos los demás elementos son 0. La matriz original será longitud 1 o más. Nota: de forma predeterminada , una nueva matriz int contiene toda 0 de .

makeLast ({ 4 , 5 , 6 } ) → { 0 , 0 , 0 , 0 , 0 , 6 }
makeLast ({ 1 , 2 } ) → { 0 , 0 , 0 , 2 }
makeLast ({ 3 } ) → { 0 , 3 }*/
public class Poner0hastaPosicion6 {
	private static int [] numeros1 = {1, 2, 9};
	
	public static int[] Poner0hastaPosicion6(int[] nums) {
	    int[] result = new int[2 * nums.length];
	    result[result.length - 1] = nums[nums.length - 1];
	    return result;
	}
	
public static void main(String[] args) {			   
int[] resultado= Poner0hastaPosicion6(numeros1);
	
	for(int i=0; i < resultado.length; i++){			   
		System.out.print(resultado[i] + " ");
    }
	}
}