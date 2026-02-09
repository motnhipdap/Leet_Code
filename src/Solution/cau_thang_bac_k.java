package Solution;

import Utils.Array;

public class cau_thang_bac_k {
    public static void dp(int n, int k) {
        long mod = (long) (1e9 + 7);
        long[] dp = new long[n + 1];

        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    dp[i] = (dp[i] + dp[i - j]) % mod;
                }
            }
            Array.out(dp);
        }

        System.out.println(dp[n]);
    }

    public static void main(String[] args) {
        dp(4, 2);
    }
}
