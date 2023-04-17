package shapes;

public class Square extends Rectangle{

    public Square(){

    }

    public Square(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    public double getPerimeter(double side) {
        return 4*side;
    }

    public double getArea(double side){
        return side*side;
    }
}
