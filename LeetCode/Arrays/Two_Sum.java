import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; //number to reach target
            if (map.containsKey(complement)) {
                return new int [] {map.get(complement), i}; //return indices
            }
            map.put(nums[i], i); //store current number with index
        }
        return new int[]{}; //return empty if no solutions found
    }
    //Main for local testing
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); //nums = [2,3,4], target = 6

        //Parse the input
        input = input.replace("nums = [", "")
                .replace("]", "")
                .replace("target =", "")
                .replace(",", " ")
                .trim();

        //Split into parts
        String[] parts = input.split("\\s+");

        //Last number is the target
        int target = Integer.parseInt(parts[parts.length - 1]);

        // Create nums[] array and fill it with all parsed integers except the last one (which is the target)
        int[] nums = new int[parts.length - 1];
        for (int i = 0; i < parts.length - 1; i++) {
            nums[i] = Integer.parseInt(parts[i]); // convert each string number into int
        }
        //Create an object for Solution class to call twoSum
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);

        System.out.println(Arrays.toString(result));
    }
}