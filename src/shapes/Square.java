package shapes;

public class Square extends Quadrilateral{

    public Square(){

    }
    public Square(double length) {
        super(length, length);
    }

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setWidth(double side) {
        this.length = side;
        this.width = side;
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
