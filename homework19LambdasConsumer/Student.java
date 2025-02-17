package homework19LambdasConsumer;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private double grade;
    private String birthYear ;

    public Student(String name, int age, double grade, String birthYear) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public String getBirthYear() {
        return birthYear;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getAge() == student.getAge() && Double.compare(getGrade(), student.getGrade()) == 0 && Objects.equals(getName(), student.getName()) && Objects.equals(getBirthYear(), student.getBirthYear());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getGrade(), getBirthYear());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", birthYear='" + birthYear + '\'' +
                '}';
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
