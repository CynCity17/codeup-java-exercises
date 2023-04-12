import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.printf("Addition => %d%n", addition(5, 2));
        System.out.printf("Subtraction => %d%n", subtraction(9, 3));
        System.out.println(multiplication(6, 4));
        System.out.println(division(20, 4));
        System.out.println(modulus(10, 7));


        int userInput = getInteger(1, 20);
        long factorial = getFactorial(userInput);
        System.out.printf("Factorial => %d%n", factorial);
        int diceSides = getDiceSide();
        System.out.println(rollDice(diceSides));


    }
    public static int addition(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static int subtraction(int x, int y){
        int sub = x-y;
        return sub;
    }
    public static int multiplication(int a, int b){
        int mul = a*b;
        return mul;
    }
    public static int division(int c, int d){
        int div = c/d;
        return div;
    }
    public static int modulus(int g, int h){
        int mod = g%h;
        return mod;
    }
    public static int getInteger(int min, int max) {
        System.out.print("Enter a number between " + min + "and" + max + ":");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput; // valid input, return the value
        } //else {
//            System.out.println("Invalid input. Please enter a number between 1 and 10."); // not necessarily needed as it will bring you back to the question in the next line, but nothing wrong with putting this line in there
            return getInteger(min, max); // recursive call to prompt again, brings you back to the original question until the input is valid

//      Sure! Let's go through the implementation of the getInteger method step by step:
//
//      The method takes two integer parameters min and max, which represent the lower and upper bounds of the allowed input range, respectively.
//
//          Inside the method, a Scanner object is created to read input from the console. The System.out.print statement is used to display a prompt message to the user, asking them to enter a number between min and max.
//
//          The method then reads an integer input from the user using scanner.nextInt() and stores it in the userInput variable.
//
//          The method then checks if the userInput is within the specified range using the condition userInput >= min && userInput <= max. If the input is within the range, the method returns the userInput as a valid integer.
//
//      If the input is not within the range, the method displays an error message using System.out.println(), indicating that the input is invalid, and prompts the user again by making a recursive call to the getInteger method with the same min and max parameters.
//
//      The recursive call to getInteger repeats the process of prompting the user for input, checking if it's within the range, and repeating the prompt if it's not, until a valid input is entered.
        }
        public static long getFactorial(int num){
            long result = 1;
            for (int i = 1; i <= num; i++) {
            result*=i;
        }
        return result;
    }
        public static int getDiceSide() {
            int userChoice = getInteger(4, 20);
            return userChoice;
            }
        public  static int randomNumber(int min, int max){
            int result = (int)Math.floor(Math.random() * (max - min + 1) + min);
            return result;
        }
        public static String rollDice(int sides) {
            System.out.println("Do you want to roll the dice? [y/N]");
            Scanner input = new Scanner(System.in);
            String userChoice = input.nextLine();
            if (userChoice.equalsIgnoreCase("y")){
                int result1 = randomNumber(1, sides);
                int result2 = randomNumber(1, sides);
                return "The first dice rolled a " + result1 + ". The second dice rolled a " + result2 + ". The total is " + (result1 + result2) + ".";
            }
            return "Fine. Go away.";
        }
}
