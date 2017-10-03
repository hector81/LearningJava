package ArrayLogic;

/*
Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7. 

lastDigit(23, 19, 13) → true
lastDigit(23, 19, 12) → false
lastDigit(23, 19, 3) → true
 */
public class UltimoDigitoIgualde3numeros {
    //ATRIBUTOS

    public static int a = 7;
    public static int b = 11;
    public static int c = 37;
//METODOS

    public static boolean UltimoDigitoIgualde3numeros(int a, int b, int c) {
        return a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10;
    }
//MAIN

    public static void main(String[] args) {
        System.out.println(UltimoDigitoIgualde3numeros(a, b, c));
    }
}
