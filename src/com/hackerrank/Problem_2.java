package com.hackerrank;

import java.util.*;

/*
https://www.hackerrank.com/challenges/java-if-else/problem
 */

public class Problem_2 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (n % 2 == 0) {
            System.out.println("Not Weird");
        } else {
            System.out.println("Weird");
        }

        scanner.close();
    }
}
