package shapes;

import util.Input;
public class CircleApp {
    public static void main(String[] args) {

        Input input = new Input();
        String userChoice = "y";
        while (input.yesNo(userChoice)) {
            Circle.outputCircleInfo();
            userChoice = input.getString("Would you like to create another circle?");
        }
        System.out.println(Circle.totalCircles);


        //this is only ok if you only have to instantiate an input object ONCE
//        double radius = new Input().getDouble("Please enter the radius of the circle:");


        //TODO: Creates an instance of Input class to get user input: THIS GOES FIRST IF YOU NEED MORE THAN ONE INSTANCE
        //        Input input = new Input();
        // Prompt the user for the radius of the circle
    //        System.out.print("Enter the radius of the circle: ");
    //        double radius = input.getDouble(); // Get a double input from the user


        // Create a Circle object with the given radius
//        Circle circle = new Circle(radius);

        // Display the circumference and area of the circle
  //      System.out.printf("Circumference: %.2f%n", circle.getCircumference());
    //    System.out.printf("Area: %.2f%n", circle.getArea());


    }
}
