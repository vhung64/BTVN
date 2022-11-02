package KTCuoiKhoa;

import java.util.ArrayList;
import java.util.List;

public class _442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int[] arr = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            if (arr[nums[i]] == 1) {
                list.add(nums[i]);
            }
            if (arr[nums[i]] == 0)
                arr[nums[i]]++;

        }
        return list;
    }
}
