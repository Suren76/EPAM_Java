package homework19LambdasConsumer;

import java.time.Year;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = List.of(
                new Student("Marlen_0",  20, 0, "00.08.2004"),
                new Student("Marlen_1",  21, 10, "01.08.2004"),
                new Student("Marlen_2",  22, 20, "02.08.2004"),
                new Student("Marlen_3",  23, 30, "03.08.2004"),
                new Student("Marlen_4",  24, 40, "04.08.2004"),
                new Student("Marlen_5",  25, 50, "05.08.2004"),
                new Student("Marlen_6",  26, 60, "06.08.2004"),
                new Student("Marlen_7",  27, 70, "07.08.2004"),
                new Student("Marlen_8",  28, 80, "08.08.2004"),
                new Student("Marlen_9",  29, 90, "09.08.2004")
        );

        processStudents(studentList, System.out::println);
        processStudents(studentList, (student -> student.setGrade( (student.getGrade() / 10) * 11 )));
        processStudents(studentList, (student -> {
            if (student.getGrade() >= 90) System.out.println(student.getGrade());
        }));

        processStudents(studentList, (student -> {
            actionWithStudent(student, (s) -> {
                int age = Year.now().getValue() - Integer.parseInt(s.getBirthYear().substring(6, 10));
                System.out.println(age);
                return age;
            });
        }));
    }

    static <T extends Student> void processStudents(List<T> studentsList, Consumer<T> action) {
        for(T student : studentsList) action.accept(student);
    }

    static void actionWithStudent(Student student, CalculateAge action) {
        action.calculate(student);
    }
}
