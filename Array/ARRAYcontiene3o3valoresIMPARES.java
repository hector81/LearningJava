package Array;
//Devolver un true si el array contiene un 3 o 3 valores IMPARES
//modThree({2, 1, 3, 5}) → true
//modThree({2, 1, 2, 5}) → false
//modThree({2, 4, 2, 5}) → true

public class ARRAYcontiene3o3valoresIMPARES {
    // ATRIBUTOS
    public static boolean metodoContieneTres(int[] array1) {
        boolean comp= false;
        int contador = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 != 0) {
                contador++;
                if (array1[i] == 3 || contador == 3) {
                    comp =  true;
                }
            }
        }
        return comp;
    }
    // MAIN
    public static void main(String[] args) {
        int[] array = {2, 4, 4, 4, 1, 1, 5};
        System.out.println("cadena : " + metodoContieneTres(array));
    }
}
