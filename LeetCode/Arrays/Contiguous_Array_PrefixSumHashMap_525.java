class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int prefixSum = 0;
        int maxLen = 0;

        map.put(0, -1); // base case

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) prefixSum++;
            else prefixSum--;

            if (map.containsKey(prefixSum))
                maxLen = Math.max(maxLen, i - map.get(prefixSum));
            else map.put(prefixSum, i);
        }
        return maxLen;
    }
}