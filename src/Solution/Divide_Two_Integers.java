package Solution;

public class Divide_Two_Integers {
    public static int divide(int dividend, int divisor) {
        long ans = (long) dividend / (long) divisor;

        if (ans > Integer.MAX_VALUE) {
            ans = Integer.MAX_VALUE;
        }
        System.out.println(ans);
        if (ans < Integer.MIN_VALUE) {
            ans = Integer.MIN_VALUE;
        }

        return (int) ans;
    }

    public static void main(String[] args) {
        System.out.println(divide(-2147483648, -1));
    }

}
