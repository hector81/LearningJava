package Array;
/*We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
 *  Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions 
 *  in the array. 

unlucky1({1, 3, 4, 5}) → true
unlucky1({2, 1, 3, 4, 5}) → true
unlucky1({1, 1, 1}) → false*/
public class UnoSeguido3 {
	// ATRIBUTOS
			private static int[] array1 = {2, 1, 3, 4, 5};			
				// METODOs
			public static boolean UnoSeguido3(int[] array1) {
				for(int i=0; i < array1.length; i++){
					if (array1[i] == 1 && array1[array1.length+1] == 3) 
			    return true;
				}
				return false;
			}
			
			/*
				public boolean unlucky1(int[] nums) {
    int len = nums.length;
    if (len <= 1) return false;
 
    for (int i = 0; i <= 1; i++) {
        if (nums[i] == 1 && nums[i + 1] == 3)
            return true;
        if (len < 3) break;
    }
 
    return nums[len - 2] == 1 && nums[len - 1] == 3;
}
			*/
				// MAIN
				public static void main(String[] args) {
								   
						System.out.print(UnoSeguido3(array1));				   
				}
				}


