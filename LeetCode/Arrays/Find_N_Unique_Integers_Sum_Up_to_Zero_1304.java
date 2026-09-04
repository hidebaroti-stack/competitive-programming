class Solution {
    public int[] sumZero(int n) {
        int left = 0;
        int right = n - 1;

        int[] result = new int[n];
        for (int i = 1; i <= n/2; i++) {
            result[left++] = i;   // put pos on left
            result[right--] = -i; // put neg on right
        }
        if (n % 2 == 1) result[left] = 0; // middle element if odd
        return result;
    }
}