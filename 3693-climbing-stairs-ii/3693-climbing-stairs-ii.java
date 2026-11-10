
class Solution {
    public int climbStairs(int n, int[] costs) {

        int[] dp = new int[n + 1];

        // Starting step has zero cost
        dp[0] = 0;

        // Calculate minimum cost for each step
        for (int i = 1; i <= n; i++) {

            dp[i] = Integer.MAX_VALUE;

            // Try jumping from previous 1, 2 or 3 steps
            for (int j = 1; j <= 3; j++) {

                if (i - j >= 0) {

                    int jumpCost = j * j;

                    int totalCost = dp[i - j]
                                  + costs[i - 1]
                                  + jumpCost;

                    dp[i] = Math.min(dp[i], totalCost);
                }
            }
        }

        return dp[n];
    }
}
