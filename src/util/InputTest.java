package util;

import java.util.Scanner;
public class InputTest {

    public static void main(String[] args) {
        Input input = new Input();

        // Test getString()
        String stringInput = input.getString();
        System.out.println("You entered: " + stringInput);

        // Test yesNo()
        boolean yesNoInput = input.yesNo();
        System.out.println("You entered: " + yesNoInput);

        // Test getInt(int min, int max)
        int intInputRange = input.getInt(1, 10);
        System.out.println("You entered: " + intInputRange);

        // Test getInt()
        int intInput = input.getInt();
        System.out.println("You entered: " + intInput);

        // Test getDouble(double min, double max)
        double doubleInputRange = input.getDouble(0.1, 1.0);
        System.out.println("You entered: " + doubleInputRange);

        //Test getDouble()
        double doubleInputDec = input.getDouble();
        System.out.println("You entered: " + doubleInputDec);
    }
}
