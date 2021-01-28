package com.hackerrank;

import java.util.*;

/*
https://www.hackerrank.com/challenges/java-strings-introduction/problem
 */

public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        String capitalFirstLetterA = a.toUpperCase().charAt(0) + a.substring(1);
        String capitalFirstLetterB = b.toUpperCase().charAt(0) + b.substring(1);

        System.out.println(a.length() + b.length());

        if (a.charAt(0) > b.charAt(0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.printf("%s %s", capitalFirstLetterA, capitalFirstLetterB);
    }
}
