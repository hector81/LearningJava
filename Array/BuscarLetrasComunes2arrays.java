package Array;
/*
commonTwo({"a", "c", "x"}, {"b", "c", "d", "x"}) → 2
commonTwo({"a", "c", "x"}, {"a", "b", "c", "x", "z"}) → 3
commonTwo({"a", "b", "c"}, {"a", "b", "c"}) → 3
 */
public class BuscarLetrasComunes2arrays {
	//ATRIBUTOS
			public static String[] letras1 = {"a", "b", "c", "d"};
			public static String[] letras2 = {"a", "b", "c", "x"};
			
			//metodos
			public static int BuscarLetrasComunes2arrays(String[] letras1, String[] letras2) {		  
				int count = 0;
			    for (int i = 0; i < letras1.length; i++)		      
			            for (int j = 0; j < letras2.length; j++)
			                if (letras1[i].equals(letras2[j])) {
			                    count++;
			                    break;			                    
			                }
			    return count;
			}
			//main
			
			public static void main(String[] args) {
				System.out.print(BuscarLetrasComunes2arrays(letras1,letras2));
			
		}
	}
