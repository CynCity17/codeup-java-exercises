public class MethodsLecture {
    public static void main(String[] args) {
        // System.out.println(sayHello("Jason"));
        // System.out.println(returnThree());
        // String myName = "Jason";
        // System.out.println(highFive("Jason"));

        // System.out.println(changeName(myName));
        // System.out.println(myName);
        count(5);
    }
    public static String sayHello(){
        String message = "Hello... I have no idea who you are....";
        return message;
    }
    public static String sayHello(String name) {
        String message = "Hello, " + name + "!";
        return message;
    }
    public static int returnThree() {
        return 3;
    }
    public static String highFive(String name) {
        return name + " give no one a high five. He has no friends.";
    }
    public static String highFive(String name1, String name2) {
        return name1 + " gives " + name2 + " a high five!";
    }
    public static String changeName(String name){
        name = "Roberto";
        return name;
    }
    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n - 1);
    }
}
