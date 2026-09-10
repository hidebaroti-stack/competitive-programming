class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;

        int left = 0;
        int right = n - 1;

        // Step 1: find initial boundaries
        while (left < n - 1 && nums[left] <= nums[left + 1]) left++;
        while (right > 0 && nums[right] >= nums[right - 1]) right--;

        if (left >= right) return 0; // already sorted

        // Step 2: find min and max in the unsorted window
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = left; i <= right; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        // Step 3: expand boundaries
        while (left > 0 && nums[left - 1] > min) left--;
        while (right < n - 1 && nums[right + 1] < max) right++;

        return right - left + 1;

    }
}