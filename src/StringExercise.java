import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        String message = "We don't need no education\n" + "We don't need no thought control";
        System.out.println(message);

        String message2 = "Check \"this\" out!, \"s inside of \"s!\n";
        System.out.println(message2);

        String message3 = "In windows, the main drive is usually C:\\\n";
        System.out.println(message3);

        String message4 = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!\n";
        System.out.println(message4);


    }
}

class Bob{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Talk with Bob. You can ask him something, yell at him, or say nothing at all.");
        String userInput = input.nextLine();
        while (!userInput.isBlank()) {
            if (userInput.endsWith("?")) {
                System.out.println("Sure");
            } else if (userInput.endsWith("!")) {
                System.out.println("Woah, chill out!");
            } else if (userInput.isBlank()) {
                System.out.println("Fine. Be that way!");
                break;
            } else {
                System.out.println("Whatever.");
            }
            userInput = input.nextLine();
        }
    }
}
