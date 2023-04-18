package shapes;

public class Square extends Quadrilateral implements Measurable{
    public Square(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

//    public Square(){
//
//    }
//
//    public Square(double side){
//        super(side, side);
//    }
//
//    public double getPerimeter() {
//        System.out.println("I'm a square");
//        return 4*this.length;
//    }
//
//    public double getArea(){
//        System.out.println("I'm a square");
//        return Math.pow(this.width, 2);
//    }
}
