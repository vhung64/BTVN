public class _724 {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0)
                temp += nums[i - 1];
            if (temp == (double)(sum - nums[i])/2){
                return i;
            }
        }
        return -1;
    }
        public static void main(String[] args) {
            // int[] nums = {-1,-1,-1,-1,-1,-1};
            // pivotIndex(nums);
            // System.out.println(pivotIndex(nums));
        }

}
