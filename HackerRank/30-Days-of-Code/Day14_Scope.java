import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    /** SCOPE **/

    //1. Private vs public variables, Class-level scope (Fields) also called as Instance scope
    private int[] elements;
    //scope is restricted to inside the 'Difference' class
    //elements can't be accessed directly from main(), encapsulation!
    public int maximumDifference;
    //scope is open to outside classes, main() can print difference.maximumDifference

    // Add your code here

    //Constructor
    Difference(int[] elements){
        this.elements = elements;
    }

    //Method
    public void computeDifference() {
        //2. Local variables inside a method, Method-level scope
        int max = elements[0];
        int min = elements[0];
        //These variables exist only within the scope of the method

        //3. Loop variables scope, Loop-level scope, known as Block scope
        for(int num : elements) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        //The variable 'num' can't be accessed outside the Loop
        maximumDifference = Math.abs(max - min);
    }

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}