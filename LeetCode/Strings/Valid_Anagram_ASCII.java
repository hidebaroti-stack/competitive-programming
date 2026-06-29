class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] counts = new int[26];
        for (char c : s.toCharArray()) {
            counts[c - 'a']++;  // if char c = 'c' then (99 - 97 = 2)
        }
        for (char c : t.toCharArray()) {
            counts[c -'a']--;
        }
        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}