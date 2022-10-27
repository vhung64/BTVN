public class _202 {
    public void main(String[] args) {
        System.out.println(isHappy(19));
    }
    public static int sumCP(int n){
        int temp = 0;
        while(n > 0){
            int count = n % 10;
            temp += count * count;
            n /= 10;
        }
        return temp;
    }
    public boolean isHappy(int n) {
        if(n == 1 || n == 7)
            return true;
        else if (n < 10)
            return false;
        else
            return isHappy(sumCP(n));
    }
}
