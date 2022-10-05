package B3;

import java.util.Arrays;

public class ThirdMaximumNumber_414 {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if (n == 1)
            return nums[0];
        else if (n == 2)
            return nums[1];
        int temp = nums[n - 1];
        int count = 1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < temp) {
                count++;
                temp = nums[i];
            }
            if (count == 3)
                break;
        }
        if (count < 3)
            return nums[n - 1];
        else
            return temp;

    }
}
