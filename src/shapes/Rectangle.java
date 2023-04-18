package shapes;

class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(){

    }
    public Rectangle(double length, double width) {
        super(length, width);
    }


    @Override
    public double getPerimeter() {
        return 2 * (length+width);
    }

    @Override
    public double getArea() {
        return length*width;
    }

    public void setLength(double side){
        this.length = side;
    }
    public void setWidth(double side){
        this.width = side;
    }

//    protected double length;
//    protected double width;
//
//    public double getLength() {
//        return length;
//    }
//
//    public void setLength(double length) {
//        this.length = length;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//    public double getPerimeter(){
//        System.out.println("I'm a rectangle");
//        return length*2 + width*2;
//    }
//
//    public double getArea(){
//        System.out.println("I'm a rectangle");
//        return length*width;
//    }
//
//    public Rectangle(){
//
//    }
//
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
}
