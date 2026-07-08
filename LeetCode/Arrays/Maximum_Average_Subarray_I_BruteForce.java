class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAverage = Double.NEGATIVE_INFINITY;

        for (int i = 0; i <= nums.length - k; i++) {
            double sum = 0;
            for (int j = i; j < i + k; j ++) {
                sum += nums[j];
            }
            double average = sum / k;
            if (average > maxAverage) maxAverage = average;
        }
        return maxAverage;
    }
}