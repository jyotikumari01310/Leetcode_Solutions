
class Solution {

    public int rob(int[] nums) {

        int n = nums.length;

        // Only one house
        if (n == 1) {
            return nums[0];
        }

        // Case 1: Rob houses from 0 to n-2
        int case1 = robLinear(nums, 0, n - 2);

        // Case 2: Rob houses from 1 to n-1
        int case2 = robLinear(nums, 1, n - 1);

        // Return maximum money
        return Math.max(case1, case2);
    }

    // Normal House Robber I logic
    public int robLinear(int[] nums, int start, int end) {

        int prev2 = 0;
        int prev1 = 0;

        for (int i = start; i <= end; i++) {

            // Option 1: Rob current house
            int rob = nums[i] + prev2;

            // Option 2: Skip current house
            int skip = prev1;

            int curr = Math.max(rob, skip);

            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}
