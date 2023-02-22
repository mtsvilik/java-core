package javacore.lesson.methodininterface.methods;

public abstract class Shape {

    public abstract void calculatePerimeter();

    public abstract void calculateSquare();

    public void showInfo() {
        System.out.println("This is a shape");
    }
}
