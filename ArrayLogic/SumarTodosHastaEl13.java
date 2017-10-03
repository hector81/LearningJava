package ArrayLogic;

//sumar todos menos el 13
//luckySum(1, 2, 3) → 6
//luckySum(1, 2, 13) → 3
//luckySum(1, 13, 3) → 1
public class SumarTodosHastaEl13 {
	//ATRIBUTOS
	private static int numero1 = 1;
	private static int numero2 = 5;
	private static int numero3 = 13;
	//metodo
	public static int SumarTodosHastaEl13(int numero1, int numero2, int numero3) {
	    if (numero1 == 13) return 0;
	    if (numero2 == 13) return numero1;
	    if (numero3 == 13) return numero1 + numero2;
	    return numero1 + numero2 + numero3;
	}
	
	//MAIN
	public static void main(String[] args) {
			   
			System.out.print(SumarTodosHastaEl13(numero1,numero2,numero3));
        }
}
