package org.example;

import java.util.Scanner;

public class allDigits {
    public static boolean isStringNumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (isStringNumber(str)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
