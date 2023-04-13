package shapes;

public class Circle {
    //Declare private radius field
    private double radius;

    // Constructor for Circle class
    // Sets the value of radius when an instance of this class is created
    public Circle(double radius) {
        this.radius = radius;
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
