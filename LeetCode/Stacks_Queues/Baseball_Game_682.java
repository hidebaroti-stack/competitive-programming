class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> opt = new Stack<>();

        for (String op : operations) {
            if (op.equals("+")) {
                int size = opt.size();
                opt.push(opt.get(size - 1) + opt.get(size - 2));
            } else if (op.equals("D")) {
                int size = opt.size();
                opt.push(opt.get(size - 1) * 2);
            } else if (op.equals("C")) {
                opt.pop();
            } else {
                opt.push(Integer.parseInt(op));
            }
        }

        int total = 0;
        for (int score : opt) {
            total += score;
        }
        return total;
    }
}