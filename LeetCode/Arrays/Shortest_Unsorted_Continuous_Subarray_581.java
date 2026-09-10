class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 0;

        int maxSoFar = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxSoFar = Math.max(maxSoFar, nums[i]);
            if (nums[i] < maxSoFar) right = i;
        }

        int minSoFar = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            minSoFar = Math.min(minSoFar, nums[i]);
            if (nums[i] > minSoFar) left = i;
        }
        return right > left ? right - left + 1 : 0;
    }
}