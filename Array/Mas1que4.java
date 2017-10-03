package Array;
//hay mas unos que cuatros

//more14({1, 4, 1}) → true
//more14({1, 4, 1, 4}) → false
//more14({1, 1}) → true
public class Mas1que4 {
    // ATRIBUTOS

    private static int[] array1 = {2, 1, 2, 3, 4, 4, 4, 4};

    // METODOs
    public static boolean Mas1que4(int array1[]) {
        int contador1 = 0;
        int contador4 = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 1) {
                contador1++;
            } else if (array1[i] == 4) {
                contador4++;
            }

            if (contador1 < contador4) {
                return false;
            }
        }
        return true;
    }
    // MAIN

    public static void main(String[] args) {

        System.out.println("cadena : " + Mas1que4(array1));
    }
}
