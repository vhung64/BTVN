package B6;

import java.util.Arrays;

public class SortanArray_912 {
    public int[] sortArray(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        int[] arr = new int[max-min+1];
        // dem so lan xuat hien cua so do va dat vao vi tri theo thu tu sap xep
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i] - min]++;
        }
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                while(arr[i] > 0){
                    nums[temp++] = i + min;
                    arr[i]--;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        // nums = [5,1,1,2,0,0] [-4,0,7,4,9,-5,-1,0,-7,-1]
        int[] nums = { -4, 0, 7, 4, 9, -5, -1, 0, -7, -1, 1, 2, 34, 5, 6, 6, 4, 343 };
        SortanArray_912 b6 = new SortanArray_912();
        System.out.println(Arrays.toString(b6.sortArray(nums)));

    }
}
