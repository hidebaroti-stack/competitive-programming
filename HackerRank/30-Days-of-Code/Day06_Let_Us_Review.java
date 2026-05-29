import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); //Number of test cases
        scanner.nextLine();        //Consume new line

        for (int t = 0; t < T; t++) {
            String S = scanner.nextLine();

            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();

            for (int i = 0; i < S.length(); i++) {
                if (i % 2 == 0) even.append(S.charAt(i));
                else odd.append(S.charAt(i));
            }

            System.out.println(even + " " + odd);

        }
        scanner.close();
    }
}