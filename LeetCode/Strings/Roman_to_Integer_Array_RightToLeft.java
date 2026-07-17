class Solution {
    public int romanToInt(String s) {
        int[] values = new int[128];
        values['I'] = 1;
        values['V'] = 5;
        values['X'] = 10;
        values['L'] = 50;
        values['C'] = 100;
        values['D'] = 500;
        values['M'] = 1000;

        int result = values[s.charAt(s.length() - 1)];
        for (int i = s.length() - 2; i >= 0; i--) {
            int value = values[s.charAt(i)];
            if (value < values[s.charAt(i + 1)]) {
                result -= value; // subtract if smaller than next
            } else {
                result += value;
            }
        }
        return result;
    }
}