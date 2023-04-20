package util;

import java.util.Scanner;

public class Input {
    // Declare a private field named scanner of type Scanner
    //Every Input object should have a scanner
    private Scanner scanner;

    // Constructor for Input class
    // When an instance of this class is created, a new instance of Scanner is also created and assigned to the scanner field
    //Everytime we make a new Input object it will have a new scanner constructed per object.
    public Input() {
        this.scanner = new Scanner(System.in);
    }

    // Method to get a string input from the user
    public String getString() {
        return scanner.nextLine();
    }

    //Overloading an object to be able to put in your own prompt
    public String getString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }

    //Method to get yes/no from user
    public boolean yesNo() {
        System.out.println("Would you like to continue? [y/N]");
        String input = scanner.nextLine();
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
//        return scanner.nextLine().equalsIgnoreCase("y") || scanner.nextLine().equalsIgnoreCase("yes"); <--- this was class example but was causing hang time because it's running scanner.nextLine AGAIN causing the hang. Could be written without the scanner inline like the above code
    }

    //Overloading yesNo takes an input and return true or false
    public boolean yesNo(String input){
        return input.equals("y") || input.equalsIgnoreCase("yes");
    }

    //Method for getting an integer between an certain range of numbers
    public int getInt(int min, int max) {
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        String userInput = getString();
        try {
            Integer.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.println("You did not enter a valid number. Please try again.");
            return getInt(min, max);
        }
        int userNum = Integer.parseInt(userInput);
        if (userNum >= min && userNum <= max) {
            return userNum;
        } else {
            System.out.println("You did not enter a number between " + min + " and " + max + ". Try again.");
            return getInt(min, max);
        }
    }

    public int getInt(){
        System.out.println("Enter an integer:");
        String userInput = getString();
        try {
            Integer.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.println("You did not enter a valid number. Please try again.");
            return getInt();
        }
        int userNum = Integer.parseInt(userInput);
        return Integer.parseInt(userInput);
    }

    //Overloading the method to have custom prompt
    public int getInt(String prompt){
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public double getDouble(double min, double max){
        System.out.printf("Enter a number between %.1f and %.1f:", min, max);
        String userInput = getString();
        try {
            Double.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.println("You did not enter a valid number. Please try again.");
            return getDouble(min, max);
        }
        Double userNum = Double.parseDouble(userInput);
        if (userNum >= min && userNum <= max) {

            return userNum;
        } else {
            System.out.println("You did not enter a number between " + min + " and " + max + ". Try again.");
            return getDouble(min, max);
        }
    }

    public double getDouble(){
        System.out.println("Enter a number (decimals allowed):");
        String userInput = getString();
        try {
            Double.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.println("You did not enter a valid number. Please try again.");
            return getDouble();
        }
        Double userNum = Double.parseDouble(userInput);
        return userNum;
    }

    //Overloading to have custom prompt
    public double getDouble(String prompt){
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    //Code from student that could be used in util
    public static int getRandomInt(){
        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println("This method gives you a random number between 1 and 100.");
        return randomNumber;
    }

    //Code from student that could be used in util
    public static int getRandomInt(int min, int max) {
        System.out.printf("Get a number between %d, and %d.%n", min, max);
        int randomNumber = (int) (Math.random() * max) + min;
        return randomNumber;
    }

    //Code added by Javier to prevent .....
    public void getGhost(){
        System.out.println("");
        String ghost = scanner.nextLine();
    }
}
