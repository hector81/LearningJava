package Array;

//Given an array of scores, return true if each score is equal or greater than the one before. The array will be length 2 or more. 

//scoresIncreasing({1, 3, 4}) → true
//scoresIncreasing({1, 3, 2}) → false
//scoresIncreasing({1, 1, 4}) → true

public class NumerosMayores {
    //ATRIBUTOS
    private static int[] numeros = {1, 3, 4, 5, 6, 8};
    //metodos
    public static boolean buscarMayores(int[] numeros) {
        int numero = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (i != 0 && i != numeros.length-1) {
                numero = numeros[i];
                if (numeros[numero] > numeros[numero - 1]) {//si la posicion es mayor que la posicion anterior                
                    return false;
                }
            }
        }
        return true;
    }

    //MAIN
    public static void main(String[] args) {
        System.out.print(buscarMayores(numeros));
    }
}
