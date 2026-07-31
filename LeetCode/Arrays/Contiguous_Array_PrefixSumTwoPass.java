class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + (nums[i] == 1 ? 1 : -1);
        }

        HashMap<Integer, Integer> earliest = new HashMap<>();
        int maxLen = 0;
        for (int i = 0; i <= n; i++) {
            if (earliest.containsKey(prefix[i])) {
                maxLen = Math.max(maxLen, i - earliest.get(prefix[i]));
            } else {
                earliest.put(prefix[i], i);
            }
        }
        return maxLen;
    }
}