package com.bridglabz.basiccore;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            sum = sum + ((double) 1 / i);
        }
        System.out.println(sum);
    }
}
