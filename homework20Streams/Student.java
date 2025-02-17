package homework20Streams;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private double grade;
    private String birthDate;

    public Student(String name, int age, double grade, String birthYear) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        setBirthDate(birthYear);
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

    public String getBirthDate() {
        return birthDate;
    }

    private void setBirthDate(String birthDate) {
        if (!(birthDate.length() == 10 && birthDate.contains("."))) {
            System.out.println("Invalid inputs!");
        }
        this.birthDate = birthDate;
    }

    public int getBirthYear() {
        return Integer.parseInt(getBirthDate().substring(6, 10));
    }

    public int getBirthMonth() {
        return Integer.parseInt(getBirthDate().substring(3, 5));
    }

    public int getBirthDay() {
        return Integer.parseInt(getBirthDate().substring(0, 2));
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getAge() == student.getAge() && Double.compare(getGrade(), student.getGrade()) == 0 && Objects.equals(getName(), student.getName()) && Objects.equals(getBirthDate(), student.getBirthDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getGrade(), getBirthDate());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
