package Array;

//evenOdd({1, 0, 1, 0, 0, 1, 1}) → {0, 0, 0, 1, 1, 1, 1}
//evenOdd({3, 3, 2}) → {2, 3, 3}
//evenOdd({2, 2, 2}) → {2, 2, 2}

public class evenOdd {
	//ATRIBUTOS
			private static int[] numeros = {3, 3, 2};
			
		//metodos
			public static int[] evenOdd(int[] nums) {
			    int[] res   = new int[nums.length];
			    int evenPos = 0;
			    int oddPos  = res.length - 1;
			 
			    for (int i = 0; i < nums.length; i++)
			        if (nums[i]  > nums[i])
			            res[evenPos++] = nums[i];
			        else
			            res[oddPos--]  = nums[i];
			    return res;
			}
			
			//MAIN
			public static void main(String[] args) {
				int[] resultado= evenOdd(numeros);
				
				for(int i=0; i < resultado.length; i++){			   
					System.out.print(resultado[i] + " ");
		        }
				
		  
				
			}
		}


