package ArrayLogic;
//dividesSelf(128) → true
//dividesSelf(12) → true
//dividesSelf(120) → false
public class DividirseAsiMismoResto0 {
	private static int numero = 12;

	public static Boolean DividirseAsiMismoResto0(int numero) {
		int numeroDividido1 = numero/10;
		int numeroDividido2 = numeroDividido1/10;
		if (numero%10 != 0 && numeroDividido1%10 != 0 && numeroDividido2%10 != 0 ) return true;
		if (numero%10 != 0 && numeroDividido1%10 != 0 ) return true;
	    return false;
		}
				
	public static void main(String[] args) {			
			System.out.println("La cadena devuelve : "
					+ DividirseAsiMismoResto0(numero));
		}
	}
