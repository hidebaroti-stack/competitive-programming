class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>(); // to store indices

        for (int i = 0; i < n; i++) {
            // while current temp is warmer than the temp at stack top
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIdx = stack.pop();
                answer[prevIdx] = i - prevIdx; // days waited
            }
            stack.push(i); // push current day index
        }
        return answer;
    }
}