class Solution {
    public boolean detectCapitalUse(String word) {
        int cap = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') cap++;
        }
        return (cap == 0)
                || (cap == word.length())
                || (cap == 1 && (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z'));
    }
}