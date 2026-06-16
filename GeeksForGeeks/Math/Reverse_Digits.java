// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        // Code here
        int reverse = 0;
        while (n != 0) {
            reverse = reverse * 10 + (n % 10);
            n /= 10;
        }
        return reverse;
    }
}