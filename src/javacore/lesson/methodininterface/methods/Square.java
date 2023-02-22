package javacore.lesson.methodininterface.methods;

public class Square extends Shape {

    int quantitySide = 4;
    int side = 10;

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of the square = " + side * quantitySide);
    }

    @Override
    public void calculateSquare() {
        System.out.println("Square of the square = " + side * side);
    }
}
