import java.util.HashMap;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, 1); // base case: prefix sum itself divisible by k

        int prefix = 0;
        int result = 0;

        for (int num : nums) {
            prefix += num;
            int remainder = prefix % k;

            // handle negative remainders
            if (remainder < 0) remainder += k;

            // if this remainder was seen before, add its count to result
            result += countMap.getOrDefault(remainder, 0);

            // update count of this remainder
            countMap.put(remainder, countMap.getOrDefault(remainder, 0) + 1);
        }

        return result;
    }
}