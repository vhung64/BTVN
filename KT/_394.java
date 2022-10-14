public class _394 {
    int i = 0;
    public String decodeString(String s) {
        StringBuilder result = new StringBuilder();
        int temp = 0;
        while (i < s.length()) {
            char c= s.charAt(i++);
            if (Character.isDigit(c)) {
                temp = temp * 10 + c - '0';
            } else if (c == '[') {
                String sub = decodeString(s);
                for (int i = 0; i < temp; i++) {
                    result.append(sub); 
                }  
                temp = 0;
            } else if (c == ']') {
                break;
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
    }
}
