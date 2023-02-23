package javacore.homework.methodininterface;

public class Lion extends Mammal {

    public Lion(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Lion likes meat");
    }

    @Override
    void sleep() {
        System.out.println("Lion sleeps all day");
    }

    @Override
    void run() {
        System.out.println("Lion is not the fastest cat");
    }
}
