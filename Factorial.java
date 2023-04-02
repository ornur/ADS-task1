package org.example;

import java.util.Scanner;

public class Factorial {
    public static int recursionFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * recursionFactorial(n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(recursionFactorial(n));
    }
}
