import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> gmailUsers = new ArrayList<>();
        Pattern gmailPattern = Pattern.compile(".*@gmail\\.com$");

        for (int i = 0; i < N; i++) {
            String[] input = bufferedReader.readLine().trim().split(" ");
            String firstName = input[0];
            String emailID = input[1];

            if (gmailPattern.matcher(emailID).matches()) {
                gmailUsers.add(firstName);
            }
        }

        bufferedReader.close();

        Collections.sort(gmailUsers);
        for (String name : gmailUsers) {
            System.out.println(name);
        }
    }
}