package ArrayLogic;
//Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum. 

	//	loneSum(1, 2, 3) → 6
	//	loneSum(3, 2, 3) → 2
	//	loneSum(3, 3, 3) → 0 
public class SumarNumeroSolitarioOtodos {
	//ATRIBUTOS
		private static int numero1 = 1;
		private static int numero2 = 5;
		private static int numero3 = 1;
		//metodo
			public static int SumarNumeroSolitarioOtodos(int numero1, int numero2, int numero3) {
			    if (numero1 == numero2 && numero2 == numero3) return 0;
			    if (numero1 == numero2) return numero3;
			    if (numero1 == numero3) return numero2;
			    if (numero2 == numero3) return numero1;
			    return numero1 + numero2 + numero3;
			}
		
		//MAIN
		public static void main(String[] args) {
				   
				System.out.print(SumarNumeroSolitarioOtodos(numero1,numero2,numero3));
	        }
	}
