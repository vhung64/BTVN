package B4;

public class Pow_50 {

    public double myPow(double x, int n) {
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
        // 1.00001 123456
        Pow_50 pow = new Pow_50();
        System.out.println(Math.pow(1.00001, 123456));
        System.out.println(Math.pow(0.00001, 2147483647));
        System.out.println(Math.pow(-2, -2147483648));
        System.out.println(pow.myPow(1.00001, 123456));
        System.out.println(pow.myPow(0.00001, 2147483647));
        System.out.println(pow.myPow(-2, -2147483648));
     }
}
