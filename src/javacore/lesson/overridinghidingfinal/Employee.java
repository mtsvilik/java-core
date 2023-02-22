package javacore.lesson.overridinghidingfinal;

public class Employee {

    private String name;
    private int age;
    private int salary;
    private int experience;

    public void eat() {
        System.out.println("Employee eats");
    }

    public void sleep() {
        System.out.println("Employee sleeps");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public int getExperience() {
        return experience;
    }
}
