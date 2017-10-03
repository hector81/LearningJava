package Array;


//Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples. 

//noTriples({1, 1, 2, 2, 1}) → true
//noTriples({1, 1, 2, 2, 2, 1}) → false
//noTriples({1, 1, 1, 2, 2, 2, 1}) → false

public class noTRIPLESenARRAY {
	//ATRIBUTOS
		public static int[] numeros = {7, 1, 1, 1, 2, 9, 7, 2, 1};
		//METODOS	
		public static boolean ContarNUEVESarray(int[] numeros) {
			for (int i = 0; i < numeros.length - 2; i++)
	            if (numeros[i] == numeros[i + 1] && numeros[i + 1] == numeros[i + 2])
	                return false;
	        return true;
	}
		  //MAIN
			public static void main(String[] args) {
					   
					System.out.print(ContarNUEVESarray(numeros));
		        }

	}