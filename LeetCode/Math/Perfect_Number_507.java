class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) return false; // 1 is not perfect number;
        int sum = 1; // since 1 is always a divisor

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) sum += num / i; // avoid double counting square root
            }
        }
        return sum == num ? true : false;
    }
}