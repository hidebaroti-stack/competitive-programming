class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int temp = nums.length - 1;
        while(left <= right) {
            int squareLeft = nums[left] * nums[left];
            int squareRight = nums[right] * nums[right];
            if (squareLeft > squareRight) {
                result[temp] = squareLeft;
                left++;
            } else {
                result[temp] = squareRight;
                right--;
            }
            temp--;
        }
        return result;
    }
}