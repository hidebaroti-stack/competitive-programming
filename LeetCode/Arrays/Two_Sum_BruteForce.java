import java.util.Scanner;
//Brute Force: checks all pairs
//Time complexity = O(n^2)
//Space Complexity = O(1)

/* Problem:Given an array of integers and a target number, find the two numbers in the array that add up to the target.
Return their indices (positions), not the numbers themselves.
   Rules: (1) Each input has exactly one valid answer      //Input: nums = [2, 7, 11, 15],  target = 9
          (2) You cannot use the same element twice        //Output: [0, 1]
          (3) The answer can be returned in any order */   //Because nums[0] + nums[1] → 2 + 7 = 9


public class Practice {
    //Method: find two indices whose values add up to the target
    public int[] twoSum(int[] numbers, int target) { //Instance Method(Non-static): belong to an object

        //Outer Loop: pick the first number
        for (int i = 0; i < numbers.length; i++) {
            //Inner Loop: pick the second number (Start from j = i+1 to avoid repeat)
            for (int j = i + 1; j < numbers.length; j++) {
                //Check if the pairs add up to the target
                if (numbers[j] == target -  numbers[i])
                    //Return indices when found
                    return new int[] {i, j};
            }//Time complexity = O(n^2) due to the nested loops
        }
        //Return empty array if no pair found
        return new int[] {};
    }

    //Main Method for personal practice
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read array size
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        //Read array elements
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        //Read target value
        int target = scanner.nextInt();

        //Call twoSum method
        Practice practice = new Practice(); //Create practice object to call the Method
        int[] result = practice.twoSum(numbers, target); //Use practice object to have accecss to the method's parameter

        //Print result
        if (result.length == 0) System.out.println("No Pair Found.");
        else System.out.println("Indices: [" + result[0] + ", " + result[1] + "]"); // [1, 2]

        /*
        ---------------------------------------------DRY RUN EXAMPLE----------------------------------------------------

        **Input:
        n = 3
        numbers [3, 2, 4]
        target = 6

        Iteration steps:
        1. i = 0 → numbers[0] = 3
            j = 1 → numbers[1] = 2 → 3 + 2 = 5 (not target)
            j = 2 → numbers[2] = 4 → 3 + 4 = 7 (not target)

        2. i = 1 → numbers[1] = 2
             j = 2 → numbers[2] = 4 → 2 + 4 = 6 (equals target!) → return indices [1, 2]

       **Output:
       Indices: [1, 2]
       ---------------------------------------------DRY RUN EXAMPLE-----------------------------------------------------
       */
    }
}