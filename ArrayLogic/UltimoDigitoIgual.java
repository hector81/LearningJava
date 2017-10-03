package ArrayLogic;
/*
Dados dos valores int no negativos , devolver true si tienen el mismo último dígito 
, por ejemplo, con 27 y 57. Tenga en cuenta que el operador " mod "% calcula residuos 
, por lo que el 17% de 10 es 7 .

lastDigit ( 7 , 17 ) → verdad
lastDigit ( 6 , 17 ) → falsa
lastDigit ( 3 , 113 ) → verdad
*/
public class UltimoDigitoIgual {
	//ATRIBUTOS
	public static int a = 7;
	public static int b = 117;
//METODOS
	public static boolean UltimoDigitoIgual(int a, int b) {
		return (Math.abs(a - b) % 2 == 0);	    
	}
//MAIN
public static void main(String[] args) {		   
	System.out.println(UltimoDigitoIgual(a,b));
}
}