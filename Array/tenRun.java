package Array;


//For each multiple of 10 in the given array, change all the values following it to be 
//that multiple of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} 
//yields {2, 10, 10, 10, 20, 20}. 

//tenRun({2, 10, 3, 4, 20, 5}) → {2, 10, 10, 10, 20, 20}
//tenRun({10, 1, 20, 2}) → {10, 10, 20, 20}
//tenRun({10, 1, 9, 20}) → {10, 10, 10, 20}

public class tenRun {

    private static int[] numeros = {10, 1, 20, 2};

    public static int[] tenRun(int[] nums) {
        int diez = 10;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                nums[i] = nums[i];
            } else {
                nums[i] = diez;
            }
        }
        return nums;

    }

    public static void main(String[] args) {
        int[] resultado = tenRun(numeros);

        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }

    }
}
