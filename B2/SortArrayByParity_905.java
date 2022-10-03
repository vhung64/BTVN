package B2;

public class SortArrayByParity_905 {
    public int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int k = 0;
        int j = result.length - 1;
        for (int i = 0; i < result.length; i++) {
            if (nums[i] % 2 == 0)
                result[k++] = nums[i];
            else
                result[j--] = nums[i];
        }
        return result;
    }
}
