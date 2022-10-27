package B5;

public class RotateString_796 {
    public boolean rotateString(String s, String goal) {
        String check = s.concat(s);
        return check.indexOf(goal)!=-1 && s.length() == goal.length();
    }
    public static void main(String[] args) {
        // "abcdeabcde""cdeab" "bbbacddceeb""ceebbbbacdd"
        String s = "bbbacddceeb", goal = "bacddceebbb";
        String check = s.concat(s);
        boolean result =  check.contains(goal);
        System.out.println(result);
    }
}
