
class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int n = nums.size();
        int minSum = Integer.MAX_VALUE;

        // Choose starting index
        for (int i = 0; i < n; i++) {

            int sum = 0;

            // Extend the subarray
            for (int j = i; j < n; j++) {

                sum += nums.get(j);

                int length = j - i + 1;

                // Check valid subarray length
                if (length >= l && length <= r) {

                    // Check positive sum
                    if (sum > 0) {
                        minSum = Math.min(minSum, sum);
                    }
                }
            }
        }

        // No positive sum found
        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}
