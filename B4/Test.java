package B4;

public class Test {
    public static double myPow(double x, int n) {
        if ( x == 0)
            return 0;
        if (n == 0 || x == 1)
            return 1;
        if (n == 1){
            return x;
        }
        else if (n > 0) {
            if (n % 2 == 0)
                return myPow(x*x, n / 2);
            else
                return myPow(x*x, n / 2) * x;
        } else {    
            return 1 / (x * myPow(x,-n - 1));
        }

    }

    public static void main(String[] args) {
        int n = -2147483648;
        double x = 2;
        System.out.println(Math.pow(x, n));
        System.out.println(myPow(x, n));
        System.out.println(myPow(0.00001, 2147483647));
    }
}
