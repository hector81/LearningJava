package Array;

//Given an array of ints, return true if one of the first 4 elements
//in the array is a 9. The array length may be less than 4. 

//arrayFront9({1, 2, 9, 3, 4}) → true
//arrayFront9({1, 2, 3, 4, 9}) → false
//arrayFront9({1, 2, 3, 4, 5}) → false
public class arrayFront9 {
	private static int[] array1 = {1, 2, 8, 9, 5};
	
	public static boolean arrayFront9(int[] array1) {
		for (int i=0; i<4; i++) {
		    if (array1[i] == 9) return true;
		  }	  
		  return false;
		
}
public static void main(String[] args) {
		
		System.out.println("La cadena devuelve : "
				+ arrayFront9(array1));
	}
}


/*
int check = (nums.length < 4) ? nums.length : 4;
        for (int i = 0; i < check; i++) {
            if (nums[i] == 9) return true;
        }
        return false;
        
*/
