package KTCuoiKhoa;

public class _844 {
    public static String formatString(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int len = 0;
        for (char c : chars) {
            if (c != '#') {
                sb.append(c);
                len++;
            } else if (len != 0) {
                sb.deleteCharAt(len - 1);
                len--;
            }
        }
        return sb.toString();
    }
    public boolean backspaceCompare(String s, String t) {
        s = formatString(s);
        t = formatString(t);
        return s.equals(t);
    }
    public static void main(String[] args) {
        String s = "a##c";
        System.out.println(formatString(s));
    }

}
