import util.*;

public class ServerNameGenerator {

private static String [] nouns = {"wolf", "can", "phone", "dog", "dragon", "cup", "coffee", "desk", "teacher", "student"};
private static String [] adjectives = {"gallant", "lazy", "superficial", "extreme", "dodgy", "perceptive", "ominous", "dark", "devilish", "bouncy"};

public static String randomElement(String[] stringArray){
    int index = util.Input.getRandomInt(0, stringArray.length-1);
    return stringArray[index];
}

    public static void main(String[] args) {
        String noun = randomElement(nouns);
        String adj = randomElement(adjectives);
        System.out.println("Here is your server name:");
        System.out.printf("%s-%s", adj, noun);
    }
//TODO:
//    Create a method that will return a random element from an array of strings.
//    Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
//
//    Here is your server name:
//    dedicated-photon

}
