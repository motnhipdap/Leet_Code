package Utils;

public class Array {
    public static void out(int[] a) {
        for (int x : a)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void out(long[] a) {
        for (long x : a)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void out2D(int[][] a) {
        for (var x : a) {
            for (int i : x)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}
