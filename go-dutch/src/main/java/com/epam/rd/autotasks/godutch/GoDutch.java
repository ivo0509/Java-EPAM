package com.epam.rd.autotasks.godutch;

import java.util.Arrays;
import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int max = numbers[0]; // Assume first element is max
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println(max);

    }
}
