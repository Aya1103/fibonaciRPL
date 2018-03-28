package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input : ");
        System.out.println();
        int n = s.nextInt();
        fibonacci(n);

    }

    public static void fibonacci(int n) {
        if (n == 1) {
            System.out.println("0");
        } else if (n == 1) {
            System.out.println("Output : ");
            System.out.println("1");
        } else {
            System.out.println("Output ");
            System.out.print("1 ");
            int a = 0;
            int b = 1;
            for (int i = 1; i < n; i++) {
                int nextNumber = a + b;
                System.out.print(nextNumber + " ");
                a = b;
                b = nextNumber;
            }
        }
    }
}
