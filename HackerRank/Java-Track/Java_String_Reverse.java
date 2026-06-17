import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char[] C = A.toCharArray();

        boolean isPalindrome = true;

        int left = 0;
        int right = C.length - 1;

        while (left < right) {
            if (C[left] != C[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome) System.out.print("Yes");
        else System.out.print("No");
        sc.close();
    }
}