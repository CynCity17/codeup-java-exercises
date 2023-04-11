import java.util.Scanner;

public class ControlStatementsLoopsLecture {
    public static void main(String[] args) {

        double discountPercentage = 2.3;
//        System.out.println(discountPercentage > 2.0);
//        System.out.println(discountPercentage != 2.0);
//        System.out.println(discountPercentage > 3 && discountPercentage == 2.3);
//        System.out.println(discountPercentage > 3 || discountPercentage == 2.3);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Continue? [y/N]");
//        String userInput = sc.next();
//
//        boolean confirmation = userInput.equalsIgnoreCase("y");
//        System.out.println(confirmation);

//        if(discountPercentage >2) {
//            //conditional code
//            System.out.println("Discount percentage is in fact, definitely greater than 2.");
//        }

//        int caseSwitch = 1;
//        switch (caseSwitch){
//            case 1:
//                System.out.println("Case 1");
//                break;
//            case 2:
//                System.out.println("Case 2");
//                break;
//            default:
//                System.out.println("Default case");
//        }

//        int i = 0;
//        while (i < 10) {
//            System.out.println("i is" + i);
//            i++;
//        }

//        do {
//            System.out.println("i is" + i);
//            i++;
//        } while (i < 10);

//        for(int i = 0; i < 10; i++){
//            System.out.println("i is" + i);
//        }

        for(int i = 0; i < 10; i++){
            System.out.println("i is" + i);
            if (i == 5) {
                break;
            }
        }



    }
}
