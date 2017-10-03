package Array;
/*
Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}. 

makePi() → {3, 1, 4}*/
public class NumeroPI {
	//ATRIBUTOS
		private static int[] numeros = {6, 1, 2, 3 };		
		//metodos
			public static boolean NumeroPI(int[] numeros) {	      
		        	return numeros[0] == 3 || numeros[numeros.length - 1] == 1
		        			|| numeros[numeros.length - 2] == 4;	     
		}
			//MAIN
				public static void main(String[] args) {
								   
						System.out.print(NumeroPI(numeros));
			        }
		}
