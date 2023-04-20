package util;

import java.util.Scanner;
public class InputTest {

    public static void main(String[] args) {
        Input input = new Input();

        //TODO: Test getString()
        // Below commented out  souts are from prior to writing overloaded methods
//        System.out.println(input.getString());
//        String stringInput = input.getString();
//        System.out.println("You entered: " + stringInput);
//        System.out.println(input.getString("Please enter a word of your choice:"));


        //TODO: Test yesNo()
//        boolean yesNoInput = input.yesNo();
//        System.out.println("You entered: " + yesNoInput);
//        String userChoice = input.getString("Would you like to continue?");
//        System.out.println(input.yesNo(userChoice));

        //TODO: Test getInt(int min, int max)
//        int intInputRange = input.getInt(1, 10);
//        System.out.println("You entered: " + intInputRange);
//        System.out.println(input.getInt(1, 100));

        //TODO: Test getInt()
//        int intInput = input.getInt();
//        System.out.println("You entered: " + intInput);
//        System.out.println(input.getInt());

        //TODO: Test getDouble(double min, double max)
//        double doubleInputRange = input.getDouble(0.1, 1.0);
//        System.out.println("You entered: " + doubleInputRange);
//        System.out.println(input.getDouble(1, 100));

        //TODO: Test getDouble()
//        double doubleInputDec = input.getDouble();
//        System.out.println("You entered: " + doubleInputDec);
//        System.out.println(input.getDouble());

        int myNum = input.getInt();
        System.out.println(myNum);
    }
}
