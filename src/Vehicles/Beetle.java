package Vehicles;

public class Beetle extends Vehicle{

    @Override
    public void makeNoise() {
        System.out.println(this.getName() + " goes putter putter");
    }

    public void breakingDownNoise(){
        super.makeNoise();
        System.out.println("Boom");
    }


    //TODO: Create a breakingDownNoise() method in the subclass. It should call super.makeNoise() and then add a second sout that adds a second noise after the first one.
}
