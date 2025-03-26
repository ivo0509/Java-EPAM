package com.epam.rd.autotasks.sequence;
import java.util.Scanner;
import java.util.Arrays;

public class FindMaxInSeq {
    public static int max() {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE; // Initialize to smallest possible value

        while (true) {
            int num = scanner.nextInt();
            if (num == 0) { // Stop reading on zero
                break;
            }
            if (num > max) {
                max = num;
            }
        }

        scanner.close();
        return max;

    }

    public static void main(String[] args) {



        System.out.println(max());


    }
}
