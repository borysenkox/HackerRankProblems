package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/java-anagrams/problem
 */

public class Problem_4 {
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length())
            return false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        for (int i = 0; i < a.length(); i++) {
            if (arrayA[i] != arrayB[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.next();
        String b = scan.next();

        scan.close();

        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
