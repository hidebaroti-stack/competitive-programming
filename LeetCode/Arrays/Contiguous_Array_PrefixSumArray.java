class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int[] firstIndex = new int[2 * n + 1];
        Arrays.fill(firstIndex, -2); // -2 means not seen
        firstIndex[n] = -1; // prefixSum = 0 at index -1

        int prefixSum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            prefixSum += (nums[i] == 1 ? 1 : -1);
            int idx = prefixSum + n;
            if (firstIndex[idx] != -2) {
                maxLen = Math.max(maxLen, i - firstIndex[idx]);
            } else {
                firstIndex[idx] = i;
            }
        }
        return maxLen;
    }
}