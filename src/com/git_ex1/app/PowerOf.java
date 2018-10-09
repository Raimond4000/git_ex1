package com.git_ex1.app;

import java.util.Scanner;

public class PowerOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int a = scanner.nextInt();
        System.out.println("Enter another nr");
        int b = scanner.nextInt();

        if (b <= 0) {
            System.out.println("Please enter nr that is > 0");
            return;
        }

        int result = a;
        for (int i = 1; i < b ; i++) {
            result *= a;
        }
            System.out.println(result);

        }
    }

