package Solution;

public class Revese_Integer {
    public static int reverse(int x) {

        int ans = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            int tmp = ans * 10 + digit;

            if ((tmp - digit) / 10 != ans) {
                return 0;
            }

            ans = ans * 10 + digit;

        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(reverse(-2147483648));
    }
}
