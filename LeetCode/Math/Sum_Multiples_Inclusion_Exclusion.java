class Solution {
    public int sumOfMultiples(int n) {
        return sumDivisibleBy(n, 3)
                + sumDivisibleBy(n, 5)
                + sumDivisibleBy(n, 7)
                - sumDivisibleBy(n, 15)
                - sumDivisibleBy(n, 21)
                - sumDivisibleBy(n, 35)
                + sumDivisibleBy(n, 105);
    }
    private int sumDivisibleBy(int n, int k) {
        int m = n / k;
        return k * m * (m + 1) / 2;
    }
}