package shapes;

public class ShapesTest {

    public static void main(String[] args) {
//        Quadrilateral box1 = new Rectangle(5, 4);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Quadrilateral box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());

        Quadrilateral myShape; // If you set the variable as Measurable variable it can only do getArea & getPerimeter
        myShape = new Rectangle(10, 15);
        System.out.println("Rectangle area: " + myShape.getArea());
        System.out.println("Rectangle perimeter: " + myShape.getPerimeter());

        myShape = new Square(10);
        System.out.println("Square area: " + myShape.getArea());
        System.out.println("Square perimeter: " + myShape.getPerimeter());
    }
}
