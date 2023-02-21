package javacore.homework.inheritance;

public class Animal {

    private int eyes;

    public Animal() {
        System.out.println("I am animal");
    }

    public Animal(int eyes) {
        this.eyes = eyes;
        System.out.println("I am animal");
    }

    public void eat() {
        System.out.println("Animal eats");
    }

    public void drink() {
        System.out.println("Animal drinks");
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }
}
