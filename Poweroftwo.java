package com.bridgelabz.day1;

import java.lang.Math;
import java.util.Scanner;
public class Poweroftwo {
    public static void main(String[] args)
    {
        int a;
        //int b;
        double b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number within 31: ");
        a = scanner.nextInt();
        if(a<32)
        {
            for(int i=0;i<a;i++)
            {
                b = (Math.pow(2,i));
                System.out.println("2^" + i + " = " + b);

            }

        }
        else
        {
            System.out.println("Enter number less than 32");
        }
    }
}