class Solution {
    public int heightChecker(int[] heights) {
        int[] count = new int[101];
        for (int i = 0; i < heights.length; i++) {
            count[heights[i]]++;
        }

        int[] expected = new int[heights.length];
        int idx = 0;

        for (int i = 1; i <= 100; i++) {
            while (count[i] > 0) {
                expected[idx] = i;
                idx++;
                count[i]--;
            }
        }

        int mismatches = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                mismatches++;
            }
        }
        return mismatches;
    }
}