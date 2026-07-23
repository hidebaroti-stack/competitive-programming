class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            if (i == 0) ans[i] = 0;
            int j = i;
            int count = 0;
            while (j != 0) {
                count += 1;
                j = j & (j - 1); // removes the lowest set bit
            }
            ans[i] = count;
        }
        return ans;
    }
}