class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        while (num > 0) {
            if ((num & 1) == 0) { // even check using bitwise AND
                num >>= 1;        // divide by 2 using right shift
            } else {
                num--;            // subtract 1
            }
            count++;
        }
        return count;
    }
}