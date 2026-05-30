import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat usCurrency = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usCurrency.format(payment);

        NumberFormat indiaCurrency = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = indiaCurrency.format(payment);

        NumberFormat chinaCurrency = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = chinaCurrency.format(payment);

        NumberFormat franceCurrency = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = franceCurrency.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}