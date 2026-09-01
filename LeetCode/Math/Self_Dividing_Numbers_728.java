class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();

        for (int num = left; num <= right; num++) {

            if (String.valueOf(num).contains("0")) continue;

            int temp = num;
            boolean isValid = true;

            while (temp > 0) {
                int digit = temp % 10;
                if (digit == 0 || num % digit != 0) {
                    isValid = false;
                    break;
                }
                temp /= 10;
            }

            if (isValid) list.add(num);
        }
        return list;
    }
}