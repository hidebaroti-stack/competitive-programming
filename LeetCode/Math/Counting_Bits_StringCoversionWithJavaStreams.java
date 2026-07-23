class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            String binary = Integer.toBinaryString(i); // o(log i)
            ans[i] = (int) binary.chars().filter(ch -> ch == '1').count(); // o (log i)
        }
        return ans;
    }
}