package javacore.lesson.overridinghidingfinal;

public class Test1 {
    void print(Animal animal) {
        System.out.println("Animal");
    }

    void print(Mouse mouse) {
        System.out.println("Mouse");
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        Animal animal = new Mouse();
        test1.print(animal);
        animal.getName();
        animal.showInfo();
        Mouse mouse = new Mouse();
        mouse.showInfoAboutMouse();
        mouse.showInfoAboutAnimal();
    }
}

class Animal {
    void getName() {
        System.out.println("Animal");
    }

    static String showName() {
        return "some Animal";
    }

    void showInfo() {
        System.out.println("Name of animal: " + showName());
    }

    void showInfoAboutAnimal() {
        System.out.println("Name of animal: " + showName());
    }
}

class Mouse extends Animal {
    @Override
    void getName() {
        System.out.println("Mouse");
    }


    static String showName() {
        return "Jerry";
    }

    void showInfoAboutMouse() {
        System.out.println("Name of mouse: " + showName());
    }
}
