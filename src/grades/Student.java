package grades;

import java.util.ArrayList;


//TODO: Create a class named Student. It should have
// private properties for the student's name, and grades.
// The grades property should be an ArrayList of integers.
// The student class should have a constructor that sets name property,
// and initializes the grades property as an empty ArrayList.
// The Student class should have the following methods:
// returns the student's name
// public String getName();
// adds the given grade to the grades property
// public void addGrade(int grade);
// returns the average of the students grades
// public double getGradeAverage();

public class Student {

    private String name;
    private ArrayList<Integer> grades;

// No Arg constructor
    public Student() {

    }

// Constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
        }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    }

    //Added improvement from walk through to improve the cluttered nature of Grades Application
    public void addGrades(ArrayList<Integer> grades){
        this.grades.addAll(grades);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        if (this.grades.size() == 0) {
            return 0;
        }

        double sum = 0;
        for (int grade : this.grades) {
            sum += grade;
        }
        return sum / this.grades.size();
    }


}

