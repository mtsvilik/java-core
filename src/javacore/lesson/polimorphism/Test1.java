package javacore.lesson.polimorphism;

public class Test1 {

    public static void main(String[] args) {
        IJump jump = new Man();
        Man man = new Man();
        Student student = new Student();

        if (jump instanceof IJump) {
            System.out.println("Jump is IJump");
        }

        if (man instanceof Human) {
            System.out.println("Man is Human");
        }

        if (student instanceof IJump) {
            System.out.println("Student is IJump");
        }
    }

}

interface IJump {
}

class Human implements IJump {
}

class Man extends Human {
}

class Student {
}