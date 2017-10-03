package Array;

public class hastaPOSICION4UN9 {
    //ATRIBUTOS

    private static int[] numeros = {0, 1, 9, 0, 1};

    //metodos
    public static boolean hastaPOSICION4UN9(int[] nums) {
        int TAMAarray = nums.length;
        int limite = 4;
        if (TAMAarray >= limite) {
            for (int i = 0; i < TAMAarray; i++) {
                if (nums[i] == 9) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    //MAIN

    public static void main(String[] args) {

        System.out.print(hastaPOSICION4UN9(numeros));
    }
}
