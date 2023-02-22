package javacore.lesson.methodininterface;

public class Employee implements IJump {

    public void eat() {
        System.out.println("Employee eats");
    }

    public void sleep() {
        System.out.println("Employee sleeps");
    }

    @Override
    public void jump() {
        System.out.println("Employee can jump");
    }
}
