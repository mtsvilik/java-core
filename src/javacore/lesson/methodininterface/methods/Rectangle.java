package javacore.lesson.methodininterface.methods;

public class Rectangle extends Shape {

    int quantitySide = 4;
    int side1 = 5;
    int side2 = 8;

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of the rectangle = " + 2 * (side1 + side2));
    }

    @Override
    public void calculateSquare() {
        System.out.println("Square of the rectangle = " + side1 * side2);
    }
}
