class Solution {
    public int longestPalindrome(String s) {
        int length = 0;
        int bitmask = 0;

        for (char c : s.toCharArray()) {
            int pos;
            if (c >= 'a' && c <= 'z') {
                pos = c - 'a'; // for 0 - 25
            } else if (c >= 'A' && c <= 'Z') {
                pos = c - 'A' + 26; // for 26 - 51
            } else {
                continue;
            }
            bitmask ^= (1 << pos);
        }
        int oddCount = Integer.bitCount(bitmask);
        return oddCount == 0 ? s.length() : s.length() - oddCount + 1;
    }
}