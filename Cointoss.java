package com.bridgelabz.day1;

import java.util.Scanner;
import java.util.Random;
public class Cointoss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of coin flips: ");
        int numFlips = scanner.nextInt();

        if (numFlips <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        Random random = new Random();
        int headsCount = 0;

        for (int i = 0; i < numFlips; i++) {
            if (random.nextBoolean()) {
                headsCount++;
            }
        }
        double headsPercentage = (double) headsCount / numFlips * 100;
        double tailsPercentage = 100 - headsPercentage;

        System.out.println("Coin flips: " + numFlips);
        System.out.println("Heads: " + headsPercentage + "%");
        System.out.println("Tails: " + tailsPercentage + "%");
    }
}
