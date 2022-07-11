package com.miraisoft.git;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        s1.toUpperCase();
        s2.toUpperCase();
        System.out.println(s1.indexOf(s2));
    }
}
