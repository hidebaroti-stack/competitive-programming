import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; //number to reach target
            if (map.containsKey(complement)) {
                return new int [] {map.get(complement), i}; //return indices
            }
            map.put(nums[i], i); //store current number with index
        }
        return new int[]{}; //return empty if no solutions found
    }