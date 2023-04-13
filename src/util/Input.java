package util;

import java.util.Scanner;

public class Input {
    // Declare a private field named scanner of type Scanner
    private Scanner scanner;

    // Constructor for Input class
    // When an instance of this class is created, a new instance of Scanner is also created and assigned to the scanner field
    public Input() {
        scanner = new Scanner(System.in);
    }

    // Method to get a string input from the user
    public String getString() {
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Would you like to continue? [y/N]");
        String input = scanner.nextLine().toLowerCase();
        return input.equals("y") || input.equals("yes");
    }

    public int getInt(int min, int max) {
        System.out.print("Enter a number between " + min + " and " + max + ":");
        int input = scanner.nextInt();
        if (input >= min && input <= max) {
            return input; // valid input, return the value
        }
        return getInt(min, max);
    }

    public int getInt() {
        System.out.print("Enter a number:");
        int input = scanner.nextInt();
        if (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter an integer: ");
            scanner.next();
        } else {
            scanner.nextLine(); // Consume newline character
        }
        return input;
    }

    public double getDouble(double min, double max){
        System.out.print("Enter a decimal number between " + min + " and " + max + ":");
        double input = scanner.nextDouble();
        if (input >= min && input <= max) {
            return input; // valid input, return the value
        }
        return getDouble(min, max);
    }

    public double getDouble(){
        System.out.print("Enter a decimal number:");
        double input = scanner.nextDouble();
        if (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter an decimal number: ");
            scanner.next();
        } else {
            scanner.nextLine(); // Consume newline character
        }
        return input;
    }
}
