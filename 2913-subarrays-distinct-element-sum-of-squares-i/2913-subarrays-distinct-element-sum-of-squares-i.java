class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int[] freq = new int[101];
            int distinct = 0;

            for (int j = i; j < n; j++) {
                if (freq[nums.get(j)] == 0) {
                    distinct++;
                }

                freq[nums.get(j)]++;
                sum += distinct * distinct;
            }
        }

        return sum;
    }
}