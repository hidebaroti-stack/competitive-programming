class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder(address);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '.') {
                sb.replace(i, i + 1, "[.]");
                i += 2; //skip past the inserted "[.]"
            }
        }
        return sb.toString();
    }
}