class Solution {
    public int pivotIndex(int[] nums) {
       int leftSum = 0, rightSum = 0;

       for (int i = 1; i < nums.length; i++) {
        rightSum += nums[i];
       }

       for (int i = 0; i < nums.length; i++) {
        if (leftSum == rightSum) return i;
       leftSum += nums[i];
       rightSum = (i == nums.length - 1) ? 0 : rightSum - nums[i + 1];
       }
       return -1;
    }
}