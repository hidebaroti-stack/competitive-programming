class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int front = -1;
        int last = -1;

        // Step 1: find initial boundaries
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                front = i;
                break;
            }
        }
        if (front == -1) return 0; // already sorted

        for (int i = n - 1; i > 0; i--) {
            if (nums[i] < nums[i - 1]) {
                last = i;
                break;
            }
        }

        // Step 2: find min and max in [front ..last]
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = front; i <=last; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        // Step 3: expand boundaries
        for (int i = 0; i < front; i++) {
            if (nums[i] > min) {
                front = i;
                break;
            }
        }
        for (int i = n - 1; i > last; i--) {
            if (nums[i] < max) {
                last = i;
                break;
            }
        }
        return last - front + 1;
    }
}