package javacore.lesson.overridinghidingfinal;

public class Test2 {

    public static void main(String[] args) {
        A c = new C();
        c.abc(new B());
    }
}

class A {

    void abc(A a) {
        System.out.println("A");
    }
}

class B extends A {

    void abc(A a) {
        System.out.println("BB");
    }

    void abc(B b1) {
        System.out.println("B");
    }
}

class C extends B {

    void abc(B b2) {
        System.out.println("C");
    }
}
