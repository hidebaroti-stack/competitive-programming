import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        // Read returned date
        int d1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        // Read due date
        int d2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        scanner.close();
        int fine = 0;

        if(y1 > y2) {
            fine = 10000; //Returned in a later year
        } else if (y1 == y2) {
            if (m1 > m2) {
                fine = 500 * (m1 - m2);
            } else if (m1 == m2 && d1 > d2) {
                fine = 15 * (d1 - d2);
            }
        }
        System.out.println(fine);
    }
}