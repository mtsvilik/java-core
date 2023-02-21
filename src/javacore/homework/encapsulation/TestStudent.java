package javacore.homework.encapsulation;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName(new StringBuilder("Misha"));
        student.setCourse(4);
        student.setGrade(12);
        student.showInfo();
    }
}
