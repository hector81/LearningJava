package Array;

public class Tiene271 {
	//ATRIBUTOS
	private static int[] numeros = {  1, 1, 2, 3, 1 };
	
	public static boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++)
            if (nums[i] == nums[i + 1] - 5
                    && (Math.abs((nums[i + 2] + 1) - nums[i]) <= 2))
                return true;
        return false;
}
	//MAIN
	public static void main(String[] args) {
					   
			System.out.print(has271(numeros));
        }
}


