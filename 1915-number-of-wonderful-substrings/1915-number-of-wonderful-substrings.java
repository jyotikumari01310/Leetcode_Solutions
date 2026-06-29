class Solution {
    public long wonderfulSubstrings(String word) {

        long[] freq = new long[1024];
        freq[0] = 1;

        int mask = 0;
        long ans = 0;

        for (char ch : word.toCharArray()) {

            mask ^= (1 << (ch - 'a'));

            ans += freq[mask];

            for (int i = 0; i < 10; i++) {
                ans += freq[mask ^ (1 << i)];
            }

            freq[mask]++;
        }

        return ans;
    }
}