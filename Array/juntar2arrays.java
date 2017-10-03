package Array;
/*
Given 2 int arrays, each length 2, return a new array length 4 containing all their elements. 

plusTwo({1, 2}, {3, 4}) → {1, 2, 3, 4}
plusTwo({4, 4}, {2, 2}) → {4, 4, 2, 2}
plusTwo({9, 2}, {3, 4}) → {9, 2, 3, 4}*/
public class juntar2arrays {
    // ATRIBUTOS

    private static int[] array1 = {7, 1, 2, 3, 4, 9};
    private static int[] array2 = {10, 11, 12};
    // METODOs

    public static int[] DevolverNumerosENMEDIOarray(int[] array1, int[] array2) {
        int[] tres = {array1[array1.length] + array2[array2.length]};
        return tres;
    }

    // MAIN
    public static void main(String[] args) {
        int[] resultado = DevolverNumerosENMEDIOarray(array1, array2);
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }
    }
}
