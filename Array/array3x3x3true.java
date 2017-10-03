package Array;
//haveThree({3, 1, 3, 1, 3}) → true
//haveThree({3, 1, 3, 3}) → false
//haveThree({3, 4, 3, 3, 4}) → false
public class array3x3x3true {

    public boolean haveThree(int[] nums) {
        int count = 0;
        int pos = -2; // in case nums[0] == 3

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                count++;
                if (i - pos == 1) {
                    return false;
                }
                pos = i;
            }
        }

        return count == 3;
    }
}
