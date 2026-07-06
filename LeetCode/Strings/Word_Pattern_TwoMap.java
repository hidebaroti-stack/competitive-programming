class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        HashMap<Character, String> pMap = new HashMap<>();
        HashMap<String, Character> wMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (pMap.containsKey(c)) {
                if (!pMap.get(c).equals(word)) return false;
            } else {
                pMap.put(c, word);
            }
            if (wMap.containsKey(word)) {
                if (wMap.get(word) != c) return false;
            } else {
                wMap.put(word, c);
            }
        }
        return true;
    }
}