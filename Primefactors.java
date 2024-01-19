package com.bridgelabz.day1;

import java.util.Scanner;

public class Primefactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its prime factors: ");
        int number = scanner.nextInt();

        System.out.print("Prime Factors of " + number + ": ");
        computePrimeFactors(number);

        scanner.close();
    }

    private static void computePrimeFactors(int n) {
        while (n % 2 == 0) {
            System.out.print("2 ");
            n /= 2;
        }

        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n > 2) {
            System.out.print(n);
        }
    }
}

