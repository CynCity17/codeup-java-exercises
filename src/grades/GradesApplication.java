package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.List;
import java.util.Set;

public class GradesApplication {

        public static void outputStudentInfo(String userInput, HashMap<String, Student> students){
            if (students.containsKey(userInput)){
            Student student = students.get(userInput);
            System.out.printf("Name: %s, Github Username: %s%nCurrent Average: %.1f%n", student.getName(), userInput, student.getGradeAverage());
            } else {
            System.out.printf("Sorry, no student found with the Github username of \"%s\"%n", userInput);
            }
        }
    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();


        Student student1 = new Student("Cody");
//      USING THE IMPROVED METHOD FOR LESS CLUTTER
        student1.addGrades(new ArrayList<>(List.of(83, 93, 75)));
        students.put("CodyDuck", student1);

        Student student2 = new Student("Jessica");
        student2.addGrade(99);
        student2.addGrade(100);
        student2.addGrade(78);
        students.put("ACupOfJava", student2);

        Student student3 = new Student("Benito");
        student3.addGrade(98);
        student3.addGrade(85);
        student3.addGrade(70);
        students.put("SeaPlusPlus", student3);

        Student student4 = new Student("Alejandra");
        student4.addGrade(70);
        student4.addGrade(81);
        student4.addGrade(77);
        students.put("RedGemstone", student4);

//        Set<String> gitHubUserNames = students.keySet();
//        for (String gitHubUsername : gitHubUserNames) {
//            Student student = students.get(gitHubUsername);
//            System.out.println(gitHubUsername + ": " + student.getName() + "'s average grade is: " + student.getGradeAverage());
//        }

        Set<String> gitHubUserNames = students.keySet();
            for (String gitHubUserName : gitHubUserNames){
            System.out.printf("|%s| ", gitHubUserName);
            }
            System.out.println("");
            System.out.println("What student would you like to see more information on?");
            System.out.println("");
            Scanner sc = new Scanner(System.in);
            String userInput = sc.nextLine();

        outputStudentInfo(userInput, students);
            while (true){
            System.out.println("Would you like to see another student? (yes/no)");
            System.out.println("");
            String userChoice = sc.nextLine().toLowerCase();
            if (userChoice.equals("no") || userChoice.equals("n")){
            System.out.println("Goodbye, and have a wonderful day!");
            System.out.println("");
            break;
            } else {
            System.out.println("What student would you like to see  more information on?");
            System.out.println("");
            userInput = sc.nextLine();
            outputStudentInfo(userInput, students);
            }
            }


    }
}
