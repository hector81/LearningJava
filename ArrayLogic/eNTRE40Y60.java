package ArrayLogic;

//cigarParty ( 30 , false) → falsa
//cigarParty ( 50 , false) → verdad
//cigarParty ( 70 , true) → verdad

public class eNTRE40Y60 {
	private static int cigarrillo = 65;
	
	public static boolean eNTRE40Y60(int cigars) {
	    if (cigars >= 40 && cigars <= 60) return true;
	    return false;
	}
	//MAIN
			public static void main(String[] args) {
					   
					System.out.print(eNTRE40Y60(cigarrillo));
		        }
}
