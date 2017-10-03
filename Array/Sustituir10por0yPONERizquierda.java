package Array;

//withoutTen({1, 10, 10, 2}) → {1, 2, 0, 0}
//withoutTen({10, 2, 10}) → {2, 0, 0}
//withoutTen({1, 99, 10}) → {1, 99, 0}

public class Sustituir10por0yPONERizquierda {
	//ATRIBUTOS
			private static int[] numeros = {1, 99, 10 };
			
		//metodos
			public static int[] Sustituir10por0yPONERizquierda(int[] nums) {
				int[] copy = new int[nums.length];
			    int index = 0;
			 
			    for (int i = 0; i < nums.length; i++)
			        if (nums[i] != 10) {
			            copy[index] = nums[i];
			            index++;
			        }
			    return copy;
			}
			
			//MAIN
			public static void main(String[] args) {
				int[] resultado= Sustituir10por0yPONERizquierda(numeros);
				
				for(int i=0; i < resultado.length; i++){			   
					System.out.print(resultado[i] + " ");
		        }
			}
		}