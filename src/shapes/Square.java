package shapes;

public class Square extends Rectangle{

    public Square(){

    }

    public Square(double side){
        super(side, side);
    }

    public double getPerimeter() {
        System.out.println("I'm a square");
        return 4*this.length;
    }

    public double getArea(){
        System.out.println("I'm a square");
        return Math.pow(this.width, 2);
    }
}
