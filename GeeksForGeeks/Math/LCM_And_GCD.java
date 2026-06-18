class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        int A = a;
        int B = b;
        // code here
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        int gcd = a;

        int lcm = (A * B) / gcd;

        return new int[]{lcm, gcd};

    }
}