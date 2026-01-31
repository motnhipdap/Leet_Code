package Solution;

public class Count_And_Say {
    static String countAndSay(int n) {

        if (n <= 1)
            return "1";

        String ans = "1";

        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            System.out.println(ans);
            int idx = 0;
            char c = ans.charAt(idx);
            int j = 0;
            for (; j < ans.length(); j++) {
                if (ans.charAt(j) == c)
                    continue;

                sb.append((j - idx)).append(c);
                c = ans.charAt(j);
                idx = j;
            }

            if (j > 0)
                sb.append((j - idx)).append(c);

            ans = sb.toString();
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
}
