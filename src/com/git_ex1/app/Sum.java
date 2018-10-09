package com.git_ex1.app;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] allNumbers = new int[5];

        int inputNumber;
        for (inputNumber = 0; inputNumber < allNumbers.length; ++inputNumber) {
            System.out.println("Please enter nr");
            allNumbers[inputNumber] = scanner.nextInt();

        }
        int sum = 0;
        for (inputNumber = 0; inputNumber < allNumbers.length; ++inputNumber) {
            sum += allNumbers[inputNumber];
        }
        System.out.println(sum);
    }

}