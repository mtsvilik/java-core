package javacore.lesson.methodininterface;

public class Animal implements IJump {
    @Override
    public void jump() {
        System.out.println("Animal can jump");
    }
}
