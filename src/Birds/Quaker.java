package Birds;

public class Quaker extends Bird {
    public void makeNoise(){
      //  super.makeNoise(); calling the default or super from the super class birds
        System.out.println(this.getName() + " goes ack-squeek");
    }

    public Quaker(){
        System.out.println("New quaker created!");
    }
}
