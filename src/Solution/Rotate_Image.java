package Solution;

import Utils.Array;

public class Rotate_Image {
    static void rotate(int[][] matrix) {

        int n = matrix.length;
        int h1 = 0, h2 = n - 1;
        int c1 = 0, c2 = n - 1;

        while (true) {

        }

    }

    static void swap(int[][] a, int i, int j) {
        for (int k = 0; k < a.length; k++) {
            int tmp = a[k][i];
            a[k][i] = a[k][j];
            a[k][j] = tmp;
        }
    }

    static void transpose(int[][] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int tmp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] a = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        Array.out2D(a);
        transpose(a, 3);
        int l = 0, r = 2;
        while (l < r) {
            swap(a, l, r);
            l++;
            r--;
        }
        Array.out2D(a);
    }
}
