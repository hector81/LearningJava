package ArrayLogic;
//Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive,
//are forbidden, so in that case just return 20. 

//sortaSum(3, 4) → 7
//sortaSum(9, 4) → 20
//sortaSum(10, 11) → 21
public class Suma20 {
    //ATRIBUTOS
    private static int a = 15;
    private static int b = 41;
    private static int c = 20;
    //metodo
    public static int Suma20(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 19) {
            return a + b;
        } else {
            return c;
        }
    }

    //MAIN
    public static void main(String[] args) {
        System.out.print(Suma20(a, b));
    }
}

