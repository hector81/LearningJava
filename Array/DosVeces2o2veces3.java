package Array;

public class DosVeces2o2veces3 {
	public boolean double23(int[] nums) {
	    int twoCount = 0;
	    int threeCount = 0;
	    for (int i = 0; i < nums.length; i++) {
	        if (nums[i] == 2)
	            twoCount++;
	        if (nums[i] == 3)
	            threeCount++;
	    }
	    return twoCount == 2 || threeCount == 2;
	}
}
