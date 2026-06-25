class Solution {
    public int differenceOfSum(int[] nums) {
        int digitSum = 0;
        int elementSum = 0;

        for ( int i = 0; i < nums.length; i++) {
            elementSum += nums[i];

            int x = nums[i];
            while (x > 0) {
                digitSum += x % 10;
                x /= 10;
            }
        }
        return Math.abs(elementSum - digitSum);
    }
}