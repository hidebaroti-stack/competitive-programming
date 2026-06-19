class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int nonZer0 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[nonZer0];
                arr[nonZer0] = arr[i];
                arr[i] = temp;
                nonZer0++;
            }
        }
    }
}