class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        return transform(pattern).equals(transform(words));
    }
    private String transform(String str) {
        int[] map = new int[256];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map[c] == 0) {
                map[c] = i + 1;
            }
            sb.append(map[c]).append(",");
        }
        return sb.toString();
    }
    private String transform(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (!map.containsKey(word)) {
                map.put(word, i + 1);
            }
            sb.append(map.get(word)).append(",");
        }
        return sb.toString();
    }
}