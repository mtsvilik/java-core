package javacore.lesson.methods;

public class Circle extends Shape {

    final double P = 3.14;
    int radius = 3;

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of the circle = " + 2 * P * radius);
    }

    @Override
    public void calculateSquare() {
        System.out.println("Square of the circle = " + P * radius * radius);
    }
}
