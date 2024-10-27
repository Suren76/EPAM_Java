package homework10OOPInheritance;

public class People {
    private String name;
    private String surname;
    private int age;

    public People(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public People(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
