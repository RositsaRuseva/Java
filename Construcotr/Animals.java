package com.company;

import java.util.Scanner;

public class Animals {


    public void printPetActivity() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter pet's name:");
        String name = scanner.nextLine();

        System.out.println("Enter pet's favourite activity:");
        String activity = scanner.nextLine();

        scanner.close();

        //Enter activity without "-ing"

        System.out.println("My pet's name is " + name + " and it likes to " +activity);
    }
}
