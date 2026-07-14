class Solution {
    public String defangIPaddr(String address) {
        String[] parts = address.split("\\.");
        return String.join("[.]", parts);
    }
}