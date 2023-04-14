import java.util.Arrays;

public class ArraysLecture {


    public static void main(String[] args) {

//        int sizeOfArray = 5;

        // array variable declaration
        int[] numbers = new int[5];
        numbers[0] = 42;
        numbers[1] = 567;
        numbers[2] = 457;
        numbers[3] = -560;
        numbers[4] = 1267;

        // array initializer syntax
        int[] moreNumbers = {45, 56, 67, 78};

//        System.out.println(moreNumbers[2]);
//        System.out.println(numbers[2]);

        // Enhanced for loop:
        // for (data-type-of-element variableName :
        // what we're looping over
        // "Loop over the numbers array
        // On each loop, pull out an int element and
        // call it 'number'"
//      for (int number : numbers) {
//          number *= number;
//          System.out.println(number);
//      }

        // For loop

//        for (int i = 0; i < moreNumbers.length; i++){
//            System.out.printf("The number at index %d is %d%n", i, moreNumbers[i]);
//        }

     }
}
