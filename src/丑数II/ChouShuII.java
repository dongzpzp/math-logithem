package 丑数II;
//
//给你一个整数 n ，请你找出并返回第 n 个 丑数 。
//
//        丑数 就是只包含质因数 2、3 和/或 5 的正整数。
class Solution {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int i = 0;
        int j = 0;
        int l = 0;
        for(int k = 1; k < n; k++){
            dp[k] = Math.min(Math.min(dp[i] * 2, dp[j] * 3), dp[l] * 5);
            if(dp[k] == dp[i] * 2){i++;}
            if(dp[k] == dp[j] * 3){j++;}
            if(dp[k] == dp[l] * 5){l++;}
        }
        return dp[n-1];
    }
}
