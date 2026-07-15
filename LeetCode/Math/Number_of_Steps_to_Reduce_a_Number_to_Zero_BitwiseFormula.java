class Solution {
    public int numberOfSteps(int num) {
        return num == 0 ? 0 : Integer.bitCount(num) + (31 - Integer.numberOfLeadingZeros(num));
    }
}