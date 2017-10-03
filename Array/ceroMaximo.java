package Array;




//Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero. 

//zeroMax({0, 5, 0, 3}) → {5, 5, 3, 3}
//zeroMax({0, 4, 0, 3}) → {3, 4, 3, 3}
//zeroMax({0, 1, 0}) → {1, 1, 0}

public class ceroMaximo {
    //ATRIBUTOS
    private static int[] numeros = {0, 5, 0, 3};
    //metodos
    public static int[] ceroMaximo(int[] nums) {
        int numeroCero = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 2 == 1 && nums[i] > numeroCero) {
                numeroCero = nums[i];
            } else if (nums[i] == 0) {
                nums[i] = numeroCero;
            }
        }
        return nums;
    }

    //MAIN
    public static void main(String[] args) {
        int[] resultado = ceroMaximo(numeros);

        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }

    }
}
