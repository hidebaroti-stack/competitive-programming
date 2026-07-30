import java.math.BigInteger;
class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;
        if (sum % 2 != 0) return false;
        int target = sum / 2;

        BigInteger bits = BigInteger.ONE;
        for (int num : nums) {
            bits = bits.or(bits.shiftLeft(num));
        }
        return bits.testBit(target);
    }
}