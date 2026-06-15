//#977(Squares of a Sorted Array)
//Problem: Given integer sorted array increasing order --return array (1) squared (2) sorted
//Example 1:
//
//Input: nums = [-4,-1,0,3,10]
//Output: [0,1,9,16,100]
//Explanation: After squaring, the array becomes [16,1,0,9,100].
//After sorting, it becomes [0,1,9,16,100].
//Optimal(Two pointers) -----**T(n) -> 0(n) -----**S(n) -> O(n)
class solution {
    public static int[] sortedArray(int[] nums) {
        //The Array
        int[] result = new int[nums.length]; // To avoid the overwriting we'll need new array
        //The variables
        int left = 0;
        int right = nums.length - 1;
        int pos = nums.length - 1;
        //The logic
        //Squaring
        while (left <= right) {  // For T(n), runs exactly n times
            int squareLeft = nums[left] * nums[left];
            int squareRight = nums[right] * nums[right];
            // Will shift if the left is smaller than the right
            if(squareLeft > squareRight) {
                result[pos] = squareLeft; // then gonna have them in new array
                left++; // left pointer will move to the next element
                pos--;  // will move to place the next element
            } else {
                right[pos] = squareRight; //if bigger pos at right pointer
                right--;
                pos--;
            }
        }
        return result;
    }
}
/*
-----------------------------------------DRY RUN-----------------------------------------
nums   = [-4, -1, 0, 3, 10]
result = [_, _, _, _, _]
left=0, right=4, pos=4

*****Step 1:
squareLeft  = (-4)*(-4) = 16
squareRight = (10)*(10) = 100

100 > 16 → place 100 at result[4]
result = [_, _, _, _, 100]
right-- → right=3
pos--   → pos=3

*****Step 2:
squareLeft  = (-4)*(-4) = 16
squareRight = (3)*(3)   = 9

16 > 9 → place 16 at result[3]
result = [_, _, _, 16, 100]
left++  → left=1
pos--   → pos=2

*****Step 3:
squareLeft  = (-1)*(-1) = 1
squareRight = (3)*(3)   = 9

9 > 1 → place 9 at result[2]
result = [_, _, 9, 16, 100]
right-- → right=2
pos--   → pos=1

*****Step 4:
squareLeft  = (-1)*(-1) = 1
squareRight = (0)*(0)   = 0

1 > 0 → place 1 at result[1]
result = [_, 1, 9, 16, 100]
left++  → left=2
pos--   → pos=0

*****Step 5:
left == right == 2
squareLeft  = (0)*(0) = 0
squareRight = (0)*(0) = 0

equal → place 0 at result[0]
result = [0, 1, 9, 16, 100]
right-- → right=1
pos--   → pos=-1

left > right → loop ends! ✅

Final Result:
[0, 1, 9, 16, 100] ✅

----------------------------------------------------------------------------------------
*/