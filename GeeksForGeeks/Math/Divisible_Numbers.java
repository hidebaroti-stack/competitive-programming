class Solution {
    static long find(long A, long B) {
        // code here
        long X;
        long remainder = A % B;

        if (remainder == 0) {
            X = A + B;
        } else {
            X = A + (B - remainder);
        }
        return X;
    }
}