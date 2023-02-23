package javacore.homework.methodininterface;

public interface ISpeak {

    default void speak() {
        System.out.println("Somebody speaks");
    }
}
