package KTCuoiKhoa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _929 {
    public String formatString(String email){
        String[] arr = email.split("@");
        char[] st = arr[0].toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char i: st) {
            if( i == '+')
                break;
            if( i != '.')
                sb.append(i);
        }
        sb.append("@");
        sb.append(arr[1]);
        return sb.toString();
    }
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String str : emails) {
            set.add(formatString(str));
        }
        return set.size();
    }

    public static void main(String[] args) {
//        String email = "test.email+alex@leetcode.com";
//        String[] arr = email.split("@");
//        System.out.println(Arrays.toString(arr));
//        System.out.println(formatString(email));
    }
}
