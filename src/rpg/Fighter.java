package rpg;

public class Fighter {

    public static int totalFighters;

    //POJO = Plain Old Java Object
    private String name;
    private int hitPoints;
    private int maxDamage;

    public static int armorClass = 15; //sets ALL fighters armor class to 15 as it is static

    //Encapsulated  by putting properties as private and using getters and setters set to public.
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getHitPoints(){
        return hitPoints;
    }
    public void setHitPoints(int hitPoints){
        this.hitPoints = hitPoints;
    }
    public int getMaxDamage(){
        return maxDamage;
    }
    public void setMaxDamage(int maxDamage){
        this.maxDamage = maxDamage;
    }

    public void printStats(){
        System.out.printf("%s has  %d hit points and does %d  maximum damage. Armor class is %d.%n", name, hitPoints, maxDamage, armorClass);
    }
    public Fighter(){
        totalFighters++;
    }
    public Fighter(String name, int hitPoints, int maxDamage){
        totalFighters++;
        this.name = name;
        this.hitPoints = hitPoints;
        this.maxDamage = maxDamage;
    }
}
