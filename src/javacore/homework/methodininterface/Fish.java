package javacore.homework.methodininterface;

public abstract class Fish extends Animal {
    public Fish(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void sleep() {
        System.out.println("It's always interesting to watch how fish sleep");
    }

    abstract void swim();
}
