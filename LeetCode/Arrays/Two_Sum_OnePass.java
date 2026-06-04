import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        //Create an empty HashMap to store numbers, index
        HashMap<Integer, Integer> map = new HashMap<>();

        //One pass: store and lookup
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            //Check if the complement exists
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i); //If not found the complement then store and look for the next one
        }
        return new int[]{}; //No solution
    }
}