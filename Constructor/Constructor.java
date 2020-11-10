package com.company;

import java.util.Scanner;

public class Constructor {

    Scanner Scanner = new Scanner(System.in);
    private final Scanner scanner ;


    String name;
    String activity;


    public Constructor(Scanner scanner) {
        java.util.Scanner scanner1;
        scanner1 = scanner;
        scanner1 = new Scanner(System.in);
        this.scanner = scanner1;
        name = scanner.nextLine();
        activity = scanner.nextLine();
    }
}
