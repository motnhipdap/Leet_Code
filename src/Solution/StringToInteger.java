package Solution;

public class StringToInteger {
    public static int myAtoi(String s) {
        int idx = 0;
        int n = s.length();
        char[] toChar = s.toCharArray();

        while (idx < n && toChar[idx] == ' ')
            idx++;

        if (idx >= n)
            return 0;

        System.out.println(toChar[idx] + " " + idx);
        int isPlus = 1;

        if (toChar[idx] == '-') {
            isPlus = -1;
            idx++;
        } else if (toChar[idx] == '+') {
            idx++;
        }

        System.out.println(isPlus);
        int ans = 0;
        for (; idx < n; idx++) {
            int digit = (toChar[idx] - '0');

            if (digit < 0 || digit > 9)
                break;
            digit *= isPlus;

            System.out.println(ans + " " + digit);
            if (Integer.MAX_VALUE / 10 == ans && digit > 7 || ans > Integer.MAX_VALUE / 10) {
                System.out.println("HI");
                ans = Integer.MAX_VALUE;
                break;
            }

            if (Integer.MIN_VALUE / 10 == ans && digit < -8 || ans < Integer.MIN_VALUE / 10) {
                ans = Integer.MIN_VALUE;
                break;
            }
            ans = ans * 10 + digit;

        }

        return ans;

    }


    public static void main(String[] args) {
        System.out.println(myAtoi("-91283472332"));

    }
}
