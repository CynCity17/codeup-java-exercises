package rpg;

public class Animals {
    private String animal;
    private String name;
    private String noise;

    public String getAnimal(){
        return animal;
    }
    public void setAnimal(String animal){
        this.animal = animal;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getNoise(){
        return noise;
    }
    public void setNoise(String noise){
        this.noise = Speech.randomQuote();  //replaced noise with Speech.randomQuote() to get the noise to be a  random quote from the Speech class
    }


    public void makeNoise(){
        System.out.printf("%s the  %s goes %s.%n", name, animal, noise);
    }
    public Animals(){

    }
    public Animals(String animal, String name, String noise){
        this.animal = animal;
        this.name = name;
        this.noise = Speech.randomQuote();
    }
}
