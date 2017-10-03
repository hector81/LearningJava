package ArrayLogic;

//Dadas tres enteros , abc, devuelven verdadero si uno de b o c es "cerrar" 
//( que difiere de una a lo sumo 1 ), mientras que el otro es " el momento" ,
//a diferencia de los otros dos valores por 2 o más. Nota: Math.abs ( num)
//calcula el valor absoluto de un número .

//closeFar ( 1 , 2 , 10 ) → verdadera
//closeFar ( 1 , 2 , 3 ) → falsa
//closeFar ( 4 , 1 , 3 ) → verdadera

public class Diferencia1 {
	//ATRIBUTOS
		private static int a = 1;
		private static int b = 2;
		private static int c = 15;
		//metodo
		public static boolean Diferencia1(int a, int b, int c) {
		    if (Math.abs(b - c) < 2) return false;
		    return Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2
		            || Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2;
		}
		
		//MAIN
		public static void main(String[] args) {
				   
				System.out.print(Diferencia1(a,b,c));
	        }
	}
