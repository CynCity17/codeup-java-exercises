package rpg;

import java.util.Arrays;
public class RPG {
    public static Monster[] addMonster(Monster[] monstersArray, Monster newMonster){
        Monster[] newMonsterArray = Arrays.copyOf(monstersArray, monstersArray.length + 1);
        newMonsterArray[newMonsterArray.length-1] = newMonster;
        return newMonsterArray;
    }
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter();
        fighter1.setName("Arata");
        fighter1.setHitPoints(17);
        fighter1.setMaxDamage(14);
        fighter1.printStats();

        Fighter fighter2 = new Fighter();
        fighter2.setName("Sozalix");
        fighter2.setHitPoints(25);
        fighter2.setMaxDamage(23);
        fighter2.printStats();

        Fighter fighter3 = new Fighter("Shrek", 95, 45);
        fighter3.printStats();

        int d20roll = D20.rolld20();
        System.out.println(d20roll);



        Animals animals1 = new Animals();
        animals1.setAnimal("Tiger");
        animals1.setName("Stripey");
        animals1.setNoise("roar");
        animals1.makeNoise();

        Animals animals2 = new Animals();
        animals2.setAnimal("Wolf");
        animals2.setName("Luna");
        animals2.setNoise("howl");
        animals2.makeNoise();

        Animals animals3 = new Animals("Alpaca", "Paco", "bleet");
        animals3.makeNoise();

        System.out.println(Fighter.totalFighters);


        Monster orc = new Monster("Orc", 13, 15, 9);
        Monster ogre = new Monster("Ogre", 11, 59, 13);
        Monster blueDragon = new Monster("Blue Dragon", 19, 225, 23);

//        Monster[] monsters = new Monster[3];
//        monsters[0] = orc;
//        monsters[1] = ogre;
//        monsters[2] = blueDragon;

        Monster [] monsters = {orc, ogre, blueDragon};

        Monster cloaker = new Monster("Cloaker", 14, 78, 10);
       Monster[] newMonsterArray = RPG.addMonster(monsters, cloaker);
       for(Monster monster : newMonsterArray){
           System.out.println(monster.getName());
       }

//        for (Monster monster : monsters){
//            System.out.printf("%s has %d hit points%n", monster.getName(), monster.getHitPoints());
//            System.out.println(monster.getName());
//        }
    }
}
