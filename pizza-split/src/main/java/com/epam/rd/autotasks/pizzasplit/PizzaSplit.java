package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;
public class PizzaSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        int slicesPerPizza = scanner.nextInt();
        scanner.close();

        int pizzas = 1;
        while ((pizzas * slicesPerPizza) % people != 0) {
            pizzas++;
        }

        System.out.println(pizzas);



    }
}
