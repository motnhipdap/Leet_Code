package Solution;

public class Zigzag_Conversion {
    public static String convert(String s, int numRows) {

        StringBuilder sb = new StringBuilder();

        char[] cs = s.toCharArray();
        int n = cs.length;

        int index = 2 * (numRows - 1);

        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < n; j += index) {
                sb.append(cs[j]);

                int diag = j + index - 2 * i;
                if (j != 0 && j != n - 1 && diag < n) {
                    sb.append(cs[diag]);
                }
            }
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }
}
