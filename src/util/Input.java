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
        System.out.print("Enter a string:");
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

        System.out.print("Enter a number between " + min + " and " + max + ":");
        int input = scanner.nextInt();
        if (input >= min && input <= max) {
            return input; // valid input, return the value
        }
        return getInt(min, max);
    }

    public int getInt() {
        System.out.println("Enter an integer:");
        return scanner.nextInt();
    }

    //Overloading the method to have custom prompt
    public int getInt(String prompt){
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public double getDouble(double min, double max){
        System.out.printf("Enter a decimal number between %.2f and %.2f:", min, max);
        double input = scanner.nextDouble();
        if (input >= min && input <= max) {
            return input; // valid input, return the value
        }
        return getDouble(min, max);
    }

    public double getDouble(){
        System.out.println("Enter a number: (decimals allowed):");
        return scanner.nextDouble();
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
