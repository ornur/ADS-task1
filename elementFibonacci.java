package org.example;

import java.util.Scanner;

public class elementFibonacci {
    public static int findFibonacciNumberByIndex(int n){
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return findFibonacciNumberByIndex(n - 1) + findFibonacciNumberByIndex(n - 2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(findFibonacciNumberByIndex(n));
    }
}
