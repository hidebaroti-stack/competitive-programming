public class Missing_Number_268 {
    class Solution {
        public int missingNumber(int[] nums) {

            int sumWithMissingNumber = nums.length * (nums.length + 1) / 2;
            int sumWithoutMissingNumber = 0;
            for (int num : nums) {
                sumWithoutMissingNumber += num;
            }
            return sumWithMissingNumber - sumWithoutMissingNumber;
        }
    }
}
