package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int billTotal = scanner.nextInt();
        if (billTotal < 0) {
            System.out.println("Bill total amount cannot be negative.");
            return;
        }

        int friends = scanner.nextInt();
        if (friends <= 0) {
            System.out.println("Number of friends cannot be negative or zero.");
            return;
        }

        scanner.close();

        int totalWithTip = billTotal + (billTotal / 10);
        int partToPay = totalWithTip / friends;

        System.out.println(partToPay);

    }
}
