package javacore.lesson.methodininterface;

public class Teacher extends Employee implements ITeach {

    public void teach() {
        System.out.println("Teacher can teach");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }
}
