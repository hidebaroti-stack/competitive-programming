class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        if (arr.length < 2) return -1;
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secLargest && arr[i] != largest) {
                secLargest = arr[i];
            }
        }
        return (secLargest == Integer.MIN_VALUE) ? -1 : secLargest;
    }
}