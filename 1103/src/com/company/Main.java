package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Input : ");
        int number = new Scanner(System.in).nextInt();
        System.out.println("\nOutput \n"
              + (fibonacciLoop(number) + ""));
    }

    public static int fibonacciLoop(int number) {
        // Fib(1) = 1, returns 1
        // Fib(2) = 2, returns 2 which is the sum of Fib(1) + Fib(1)
        if (number < 3) {
            return number;
        }

        int sum = 2; // 2 is the sum till Fib(2)
        int fibo1 = 1, fibo2 = 1, fibonacci = 1;
        for (int i = 3; i <= number; i++) {
            fibonacci = fibo1 + fibo2;
            sum += fibonacci;
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }

        return sum;
    }
}
