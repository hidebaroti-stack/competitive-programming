class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        ans[0] = 0;

        for (int i = 1; i <= n; i++) {
            // Brian Kernighan's trick once to compute bit count
            int j = i;
            int count = 0;
            while (j != 0) {
                j = j & (j - 1); // removes the lowest set bit
                count++;         // increment once per removed bit
            }
            ans[i] = count;
        }
        return ans;
    }
}