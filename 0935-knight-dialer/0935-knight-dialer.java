class Solution {
    public int knightDialer(int n) {
        int mod = 1000000007;
        long[][] dp = new long[n + 1][10];
        
        for (int digit = 0; digit <= 9; digit++) {
            dp[1][digit] = 1;
        }
        
        for (int len = 2; len <= n; len++) {
            dp[len][0] = (dp[len - 1][4] + dp[len - 1][6]) % mod;
            dp[len][1] = (dp[len - 1][6] + dp[len - 1][8]) % mod;
            dp[len][2] = (dp[len - 1][7] + dp[len - 1][9]) % mod;
            dp[len][3] = (dp[len - 1][4] + dp[len - 1][8]) % mod;
            dp[len][4] = (dp[len - 1][0] + dp[len - 1][3] + dp[len - 1][9]) % mod;
            dp[len][5] = 0;
            dp[len][6] = (dp[len - 1][0] + dp[len - 1][1] + dp[len - 1][7]) % mod;
            dp[len][7] = (dp[len - 1][2] + dp[len - 1][6]) % mod;
            dp[len][8] = (dp[len - 1][1] + dp[len - 1][3]) % mod;
            dp[len][9] = (dp[len - 1][2] + dp[len - 1][4]) % mod;
        }
        
        long totalWays = 0;
        for (int digit = 0; digit <= 9; digit++) {
            totalWays = (totalWays + dp[n][digit]) % mod;
        }
        
        return (int) totalWays;
    }
}
