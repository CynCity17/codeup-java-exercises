import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is" + i);
//            i++;
//        }

//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);
//
//        i = 100;
//        do{
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);
//
//        long num = 2;
//        do{
//            System.out.println(num);
//            num *= num;
//        } while (num < 1000000);

//        for(int i = 1; i <= 100; i++){
//            if ((i%15) == 0) {
//                System.out.println("FizzBuzz");
//            } else if ((i%3) == 0) {
//                System.out.println("Fizz");
//            } else if ((i%5) == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        Scanner scanner = new Scanner(System.in);
//        String userInput;
//        do{
//            System.out.println("What number would you like to go up to?");
//            int input = scanner.nextInt();
//            System.out.println("\nHere is a your table!\n");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for(int i = 1; i <= input; i++){
//                System.out.printf("%-6d | %-7d | %-5d%n", i, i*i, i*i*i);
//            }
//            System.out.println("\nDo you want to continue? (y/n)");
//            userInput = scanner.next();
//        } while (userInput.equalsIgnoreCase("y"));

        Scanner input = new Scanner(System.in);
        System.out.println("What is the grade?");
        int numberGrade = input.nextInt();
        input.nextLine();
        if(numberGrade <= 100 && numberGrade >=88) {
            System.out.println("Letter grade is: A");
        } else if (numberGrade <= 87 && numberGrade >= 80) {
            System.out.println("Letter grade is: B");
        } else if (numberGrade <= 79 && numberGrade >= 67) {
            System.out.println("Letter grade is: C");
        } else if (numberGrade <= 66 && numberGrade >= 60) {
            System.out.println("Letter grade is: D");
        } else if (numberGrade <= 59 && numberGrade >= 0) {
            System.out.println("Letter grade is: F");
        }


    }
}
