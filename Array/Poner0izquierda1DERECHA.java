package Array;
//Devuelve una matriz que contiene los mismos números exactos como la matriz dada ,
//pero reorganizado de manera que todos los ceros se agrupan en el inicio de la matriz. 
//El orden de los números que no son cero , no importa. Así { 1 , 0 , 0 , 1 } se convierte 
//en { 0 , 0 , 1 , 1 } . Usted puede modificar y devolver la matriz dada o hacer una nueva matriz.

//zeroFront ({ 1 , 0 , 0 , 1 } ) → { 0 , 0 , 1 , 1 }
//zeroFront ({ 0 , 1 , 1 , 0 , 1 } ) → { 0 , 0 , 1 , 1 , 1 }
//zeroFront ({ 1 , 0 } ) → { 0 , 1 }

public class Poner0izquierda1DERECHA {
	//ATRIBUTOS
	private static int[] numeros = {  0 , 1 , 1 , 0 , 1 };
	
//metodos
	public static int[] Poner0izquierda1DERECHA(int[] nums) {
		int[] res      = new int[nums.length];
	    int zeroPos    = 0;
	    int nonZeroPos = res.length - 1;
	 
	    for (int i = 0; i < nums.length; i++)
	        if (nums[i] == 0)
	            res[zeroPos++]    = 0;
	        else
	            res[nonZeroPos--] = nums[i];
	 
	    return res;
	}
	
	//MAIN
	public static void main(String[] args) {
		int[] resultado= Poner0izquierda1DERECHA(numeros);
		
		for(int i=0; i < resultado.length; i++){			   
			System.out.print(resultado[i] + " ");
        }
		
  
		
	}
}
