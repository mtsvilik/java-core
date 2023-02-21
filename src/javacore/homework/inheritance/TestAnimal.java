package javacore.homework.inheritance;

public class TestAnimal {

    public static void main(String[] args) {
        Dog dog = new Dog("Gans");
        System.out.println("The number of paws of the dog: " + dog.getPaw());

        Cat cat = new Cat("Alister");
        cat.sleep();
    }
}
