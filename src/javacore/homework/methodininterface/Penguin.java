package javacore.homework.methodininterface;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Penguin likes to eat fish");
    }

    @Override
    void sleep() {
        System.out.println("Penguins sleep next to each other");
    }

    @Override
    void fly() {
        System.out.println("Penguin can't fly");
    }

    public void speak() {
        System.out.println("Penguin can't speak");
    }
}
