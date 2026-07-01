class Solution {
    public boolean detectCapitalUse(String word) {
        int cap = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) cap++;
        }
        return (cap == 0)
                || (cap == word.length())
                || (cap == 1 && Character.isUpperCase(word.charAt(0)));
    }
}