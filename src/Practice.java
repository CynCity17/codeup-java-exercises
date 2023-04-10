import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        String userInput = scanner.next();
        System.out.println("The user entered: " + Integer.parseInt(userInput));
    }
}
