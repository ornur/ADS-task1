package org.example;

import java.util.Scanner;

public class exponent {
    public static int exponentOfNumbers(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * exponentOfNumbers(a, n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(exponentOfNumbers(a, n));
    }
}
