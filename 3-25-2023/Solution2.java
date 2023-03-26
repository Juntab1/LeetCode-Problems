// Dynamic Programming
class Solution {
    public int climbStairs(int n) {
        // no technical 0's step so that is why you do + 1
        int[] dp = new int[n + 1];
        // when lets say we want to go to 2 steps and we can take 2 steps we
        // are technically taking 1 step
        dp[0] = 1;
        // when we are taking 1 step to reach like 2
        dp[1] = 1;
        for (int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

}