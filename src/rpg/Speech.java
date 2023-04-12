package rpg;

public class Speech {
    public static String randomQuote(){
        int randomNumber = (int) (Math.random() * 4) +1;
        switch (randomNumber){
            case 1: return "Ruuuuuuuuun!";
            case 2: return "You coward!";
            case 3: return "Today is a beautiful day.";
            case 4: return "Hit harder!";
            default: return "Try again!";
        }
    }
}
