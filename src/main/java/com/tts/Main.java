package com.tts;

public class Main {
    public static void main(String[] args) {
//        Pet

        System.out.println("====Pet====");
        Pet pet= new Pet();
        pet.setName("Zazu");
        pet.setType("Dog");
        pet.setAge(2);
        pet.setLocation("Charlotte");

        System.out.println(pet.getName());
        System.out.println(pet.getType());
        System.out.println(pet.getAge());
        System.out.println(pet.getLocation());
        System.out.println();

//        Students

        System.out.println("====Students====");
        Students students= new Students();
        students.setFirstName("Peter");
        students.setLastName("Pan");
        students.setAge(12);
        students.setGrade(6);

        System.out.println(students.getFirstName());
        System.out.println(students.getLastName());
        System.out.println(students.getAge());
        System.out.println(students.getGrade());
        System.out.println(students.checkGrade(6));
        System.out.println(students.studentDetails());
    }
}
