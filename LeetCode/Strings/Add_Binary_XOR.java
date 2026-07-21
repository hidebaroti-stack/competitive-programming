class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;

        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {
            int bitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int bitB = (j >= 0) ? b.charAt(j) - '0' : 0;
            int sumBit = bitA ^ bitB ^ carry;

            carry = (bitA & bitB) | (bitA & carry) | (bitB & carry);
            sb.append(sumBit);
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}