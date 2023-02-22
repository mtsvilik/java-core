package javacore.lesson.methodininterface;

public class Fireman extends Employee implements IExtinguish, ISwim {

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void extinguishFire() {
        System.out.println("Fireman can extinguish");
    }

    @Override
    public void swim() {
        System.out.println("Fireman can swim");
    }
}


