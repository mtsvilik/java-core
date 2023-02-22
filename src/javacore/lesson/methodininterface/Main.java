package javacore.lesson.methodininterface;

public class Main {

    public static void main(String[] args) {
        IJump j1 = new Animal();
        IJump j2 = new Employee();
        Animal animal = new Animal();
        animal.jump();
        Employee employee = new Employee();
        employee.jump();
        j1.jump();
        j2.jump();
    }
}
