package rpg;

public class Monster {
    //all the below private are called instance variables or properties and are called such because they are for each instance not the class. In this case for each Monster
    private String name;
    private int armorClass;
    private int hitPoints;
    private int damage;

    //Getters and setters: in Intellij you can use CMD + N to set these
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    //Constructors are below. Simple and Overloaded. Again like the above you can use CMD + N
    public Monster() {
    }

    public Monster(String name, int armorClass, int hitPoints, int damage) {
        this.name = name;
        this.armorClass = armorClass;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }
}
