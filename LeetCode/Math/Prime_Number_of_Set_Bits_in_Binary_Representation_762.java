import java.util.Set;
import java.util.HashSet;

class Solution {
    public int countPrimeSetBits(int left, int right) {
        // Precompute primes up to 20
        Set<Integer> primes = new HashSet<>();
        int[] primeList = {2, 3, 5, 7, 11, 13, 17, 19};
        for (int p : primeList) primes.add(p);

        int count = 0;
        for (int num = left; num <= right; num++) {
            int bits = Integer.bitCount(num); // count set bits
            if (primes.contains(bits)) count++;
        }
        return count;
    }
}
