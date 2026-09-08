class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int countZero = 0;
        for (int num : arr) {
            if (num == 0) countZero++;
        }
        for (int i = 0; i < countZero; i++) arr[i] = 0;
        for (int i = countZero; i < arr.length; i++) arr[i] = 1;
    }
}