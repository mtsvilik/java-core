package javacore.homework.encapsulation;

public class Student {

    private StringBuilder name;
    private int course;
    private int grade;

    public void showInfo() {
        System.out.println("Name " + getName() + " course " + getCourse() + " grade " + getGrade());
    }

    public StringBuilder getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(StringBuilder name) {
        if (name.length() > 3)
            this.name = name;
    }

    public void setCourse(int course) {
        if (course >= 1 && course < 5)
            this.course = course;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade < 11)
            this.grade = grade;
    }
}
