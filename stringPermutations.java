package org.example;

import java.util.Scanner;

public class stringPermutations {
    public static void printPermutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + "\n");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            printPermutations(ros, ans + ch);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        printPermutations(a, "");
    }
}
