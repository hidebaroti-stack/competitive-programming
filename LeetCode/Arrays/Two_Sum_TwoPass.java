import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        //Create an empty HashMap to store numbers, index
        HashMap <Integer, Integer> map = new HashMap<>();

        //Pass1: Store int the Maps as map: {key:value} = {number:index}
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        //Pass 2: For each element check if the complement exists
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            //Check the complememt and if it is not the same index, 4 + 4 = 8 (x)
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{map.get(complement), i};
            }
        }
        return new int[]{}; //If no solution
    }
}