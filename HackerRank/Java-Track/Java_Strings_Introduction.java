import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        //Print sum of their length
        int sum = 0;
        sum = A.length() + B.length();
        System.out.println(sum);

        //check whether A is lexicographically greater than B
        if (A.compareTo(B) > 0) System.out.println("Yes");
        else System.out.println("No");

        //Capitalize the first letter in both A and B
        //Print them on a single line, separated by a space
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));

    }
}
