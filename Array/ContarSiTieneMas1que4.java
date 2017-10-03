package Array;
//more14({1, 4, 1}) → true
//more14({1, 4, 1, 4}) → false
//more14({1, 1}) → true
public class ContarSiTieneMas1que4 {
	   // ATRIBUTOS

    private static int[] array1 = {1, 4, 1, 4, 1};

    // METODOs
    public static boolean Contiene2o3(int array1[]) {
        int posicion1 = 0;
        int posicion4 = 0;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 1) {
                posicion1++;
            }
            if (array1[i] == 4) {
                posicion4++;
            }
        }
        if (posicion1 > posicion4) {
            return true;
        }
        return false;
    }//fin metodo
    // MAIN
    public static void main(String[] args) {
        System.out.println("cadena : " + Contiene2o3(array1));
    }//fin main
}//fin clase
