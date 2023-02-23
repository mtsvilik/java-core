package javacore.homework.methodininterface;

public class Main {

    public static void main(String[] args) {
        Swordfish swordfish = new Swordfish("Karl");
        System.out.println(swordfish.name);
        swordfish.eat();
        swordfish.sleep();
        swordfish.swim();

        ISpeak penguin = new Penguin("Tosha");
        penguin.speak();

        Animal lion = new Lion("Leva");
        System.out.println(lion.name);
        lion.eat();
        lion.sleep();

        Mammal mammal = new Lion("Levochka");
        System.out.println(mammal.name);
        mammal.run();
        mammal.eat();
        mammal.speak();
        mammal.sleep();
    }
}
