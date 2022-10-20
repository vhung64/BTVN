package B8;

import java.util.*;

public class _1122 {
//    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
//        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
//        int[] result = new int[arr1.length];
//        for (int nums : arr1) {
//            if(map.get(nums) == null)
//                map.put(nums, 1);
//            else{
//                map.put(nums, map.get(nums) + 1);
//            }
//        }
//        int count = 0;
//        for (int nums : arr2) {
//            for (int i = 0; i < map.get(nums); i++) {
//                result[count++] = nums;
//            }
//            map.remove(nums);
//        }
//        for (int nums : map.keySet()) {
//            for (int i = 0; i < map.get(nums); i++) {
//                result[count++] = nums;
//            }
//        }
//        return result;
//    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] arr = new int[1001];
        int[] result = new int[arr1.length];
        for (int i : arr1) {
            arr[i]++;
        }
        int count = 0;
        for (int i : arr2) {
            while (arr[i] > 0){
                result[count++] = i;
                arr[i]--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] > 0){
                result[count++] = i;
                arr[i]--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 };
        int[] arr2 = { 2, 1, 4, 3, 9, 6 };
        int[] arr3 = relativeSortArray(arr1, arr2);
        System.out.println(Arrays.toString(arr3));
    }
}
