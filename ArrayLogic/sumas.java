package ArrayLogic;
/*Given two int values, return their sum. Unless the two values are the same, then return double their sum. 

sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8*/
public class sumas {
	private static int numero1 = 16;
	private static int numero2 = 3;	
		public static int sumas(int numero1,int numero2) {
		    if (numero1 != numero2) return numero1 + numero2;
		    if (numero1 == numero2) return (numero1 + numero2)*2; 
		    return 0;
		}

		//MAIN
				public static void main(String[] args) {
						   
						System.out.print(sumas(numero1, numero2));
			        }
	}