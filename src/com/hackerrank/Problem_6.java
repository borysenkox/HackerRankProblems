package com.hackerrank;

import java.io.*;

/*
https://www.hackerrank.com/challenges/java-negative-subarray/problem
*/

public class Problem_6 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }

        System.out.println(negativeSubArrays(array));
    }

    public static int negativeSubArrays(int[] array) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                if (sum < 0) {
                    count++;
                }
            }
            sum = 0;
        }
        return count;
    }
}