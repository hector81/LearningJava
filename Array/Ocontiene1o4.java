package Array;

//Given an array of ints, return true if it contains no 1's or it contains no 4's. 

//no14({1, 2, 3}) → true
//no14({1, 2, 3, 4}) → false
//no14({2, 3, 4}) → true

public class Ocontiene1o4 {
    // ATRIBUTOS

    private static int[] array1 = {1, 2, 3};

    // METODOs
    public static boolean Ocontiene1o4(int array1[]) {
        int ones = 0;
        int fours = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 1) {
                ones++;
            }
            if (array1[i] == 4) {
                fours++;
            }
        }
        return ones == 0 || fours == 0;
    }
    // MAIN

    public static void main(String[] args) {

        System.out.println("cadena : " + Ocontiene1o4(array1));
    }
}
