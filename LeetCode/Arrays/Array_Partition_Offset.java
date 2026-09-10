class Solution {
    public int arrayPairSum(int[] nums) {
        int offset = 10000; // shift for negatives
        int[] count = new int[20001]; // range [-10000, 10000]

        // Step 1: frequency count
        for (int num : nums) count[num + offset]++;

        // Step 2: simulate sorted traversal
        int sum = 0;
        boolean take = true; // alternate picking
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                if (take) {
                    sum += i - offset; // convert back to original val
                }
                take = !take; // flip between taking and skipping
                count[i]--;
            }
        }
        return sum;
    }
}