class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zero = 0;

        // Step 1: Counting Zeros
        for (int k : arr) {
            if (k == 0) zero++;
        }

        // Step 2: Two Pointers
        int i = n - 1;         // original pointer
        int j = n + zero - 1; // virtual pointer

        // Step 3: Walking backwardsuntil i < 0
        while (i >= 0) {
            if (arr[i] != 0) {
                if (j < n) arr[j] = arr[i];
            } else {
                if (j < n) arr[j] = 0;
                j--;
                if (j < n) arr[j] = 0; // duplicate
            }
            i--;
            j--;
        }
    }
}