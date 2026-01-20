package Solution;

public class SQRT {
    public static double sqrt(double x) {
        if (x < 1)
            return 0;
        if (x == 1)
            return 1;

        double l = 0, r = x;
        double eps = 1e-9;

        while (r - l > eps) {

            double m = (l + r) / 2;

            if (m * m > x)
                r = m;
            else
                l = m;

        }

        return l;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(10));
    }
}
