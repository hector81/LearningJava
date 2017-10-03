package ArrayLogic;
//For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values. To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times. Write the helper entirely below and at the same indent level as roundSum(). 

//roundSum(16, 17, 18) → 60
//roundSum(12, 13, 14) → 30
//roundSum(6, 4, 4) → 1
public class RoundSum {
	//ATRIBUTOS
			private static int numero1 = 1;
			private static int numero2 = 5;
			private static int numero3 = 1;
			//metodo
			public static int num(int numero1, int numero2, int numero3) {
			    int num=0;
				return num = numero1 + numero2 + numero3;
			}
			 
			public static int roundSum(int num) {
			    return (num % 10 < 5) ? (num / 10 * 10) : (num / 10 * 10 + 10);
			}
			
			//MAIN
			public static void main(String[] args) {
					   
					System.out.print(roundSum(num(numero1, numero2, numero3)));
		        }
		}
