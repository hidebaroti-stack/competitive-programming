class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            if (freq.get(num) <= k) list.add(num);
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) result[i] = list.get(i);
        return result;
    }
}