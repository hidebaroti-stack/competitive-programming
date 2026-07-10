import java.util.BitSet;

class Solution {
    public int longestPalindrome(String s) {
        BitSet bits = new BitSet();
        for (char c : s.toCharArray()) {
            bits.flip(c);
        }
        int oddCount = bits.cardinality();
        return oddCount == 0 ? s.length() : s.length() - oddCount + 1;
    }
}