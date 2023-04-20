package grades;

import java.util.ArrayList;

public class StudentTest {

    public static void main(String[] args) {


        Student student1 = new Student("Cody");
            student1.addGrade(83);
            student1.addGrade(93);
            student1.addGrade(75);
        System.out.println(student1.getName() + "'s grade average is: " + student1.getGradeAverage());
        System.out.println(student1.getGrades());
        // System.out.printf("%s's grade average is: %d.%n", student1.getName(), student1.getGradeAverage());

        Student student2 = new Student("Jessica");
            student2.addGrade(99);
            student2.addGrade(100);
            student2.addGrade(78);
        System.out.println(student2.getName() + "'s grade average is: " + student2.getGradeAverage());
        System.out.println(student2.getGrades());

        Student student3 = new Student("Benito");
            student3.addGrade(98);
            student3.addGrade(85);
            student3.addGrade(70);
        System.out.println(student3.getName() + "'s grade average is: " + student3.getGradeAverage());
        System.out.println(student3.getGrades());

        Student student4 = new Student("Alejandra");
            student4.addGrade(70);
            student4.addGrade(81);
            student4.addGrade(77);
        System.out.println(student4.getName() + "'s grade average is: " + student4.getGradeAverage());
        System.out.println(student4.getGrades());

    }
}
