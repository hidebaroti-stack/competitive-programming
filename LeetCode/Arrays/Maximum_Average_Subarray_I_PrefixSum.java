class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int[] prefix = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= nums.length - k; i++) {
            int sum = prefix[i + k] - prefix[i];
            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum / k;
    }
}