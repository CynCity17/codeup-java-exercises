package shapes;

import util.Input;

public class Circle {

    public static int totalCircles;

    //Declare private radius field
    private double radius;

    // Constructor for Circle class
    // Sets the value of radius when an instance of this class is created
    public Circle(double radius) {

        this.radius = radius;
        totalCircles++;
    }

    public static void outputCircleInfo(){
        double radius = new Input().getDouble("Please enter the radius of the circle:");
        Circle circle = new Circle(radius);
        System.out.printf("The area of your circle is: %.2f%n", circle.getArea());
        System.out.printf("The circumference of your circle is: %.2f%n", circle.getCircumference());
    }
//    public double getRadius(){
//        return radius;
//    }
//
//    public void setRadius(double radius){
//        this.radius = radius;
//    }
    public double getArea(){
        return Math.PI * radius * radius; // Area of a circle = π * r^2
    }
    public double getCircumference(){
        return 2 * Math.PI * radius; // Circumference of a circle = 2 * π * r
    }

}
