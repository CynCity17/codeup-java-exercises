package Birds;

public class BirdShelter {

    public static void main(String[] args) {
        Bird[] birds = new Bird[3];
        birds[0] = new Finch();
        birds[0].setName("Finch");
        birds[1] = new Goose();
        birds[1].setName("Goose");
        birds[2] = new Quaker();
        birds[2].setName("Quaker");


        //loop over a collection of things. The second birds is what your looping over, the first  is the collection of things
        for (Bird bird : birds){
            bird.makeNoise();
        }
    }
}
