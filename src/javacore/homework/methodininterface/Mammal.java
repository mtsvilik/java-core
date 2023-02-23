package javacore.homework.methodininterface;

public abstract class Mammal extends Animal implements ISpeak {

    public Mammal(String name) {
        super(name);
        this.name = name;
    }

    abstract void run();
}
