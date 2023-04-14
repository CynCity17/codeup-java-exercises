import java.util.Arrays;


public class ArraysExercises {


    public static Person[] addPerson(Person[] personsArray, Person person){
        Person[] newPersonsArray = Arrays.copyOf(personsArray, personsArray.length+1);
        newPersonsArray[newPersonsArray.length-1] = person;
        return newPersonsArray;
    }

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));


        Person person1 = new Person("John");
        Person person2 = new Person("Zara");
        Person person3 = new Person("Cyn");

        Person [] persons = {person1, person2, person3};


        Person person4 = new Person("Sailuna");
        Person[] newPersonArray = ArraysExercises.addPerson(persons, person4);
        for(Person person : newPersonArray){
            System.out.println(person.getName());
        }

//        for (Person person : persons){
//            System.out.printf("This person's name is: %s%n", person.getName());
//            System.out.println(person.getName());
//        }
    }
}
