import java.util.Arrays;// Brute force - T(n) -> O(nlogn)
public int[] sortedSquares(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
        nums[i] = nums[i] * nums[i]; // square each element
    }
    Arrays.sort(nums); // sort the squared array
    return nums;
}