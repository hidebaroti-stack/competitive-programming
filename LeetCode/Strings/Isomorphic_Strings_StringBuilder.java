class Solution {
    public boolean isIsomorphic(String s, String t) {
        return transform(s).equals(transform(t));
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
}