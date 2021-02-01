package com.hackerrank;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem
 */

public class Problem_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int result = x / y;
            System.out.println(result);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        } catch (ArithmeticException e) {
            System.out.printf("%s: %s", e.getClass().getName(), e.getMessage());
        }

        sc.close();
    }
}
