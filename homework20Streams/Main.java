package homework20Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = IntStream.range(1, 21)
                .mapToObj(index ->
                        new Student(
                                "Marlen_%s".formatted(index),
                                // students age starts from 16 and grows
                                16 + index,
                                index * 5,
                                // formula to generate valid date
                                "%s.08.%s".formatted(
                                        (index % 12 + 1 < 10 ? "0" : "") + (index % 12 + 1),
                                        (2000 + index % 12)
                                )
                        )
                )
                .collect(Collectors.toList());

        // print all students
        //studentList.forEach(System.out::println);

        // add student to pass filter conditions
        studentList.add(new Student("ZeroBoy", 20, 75, "02.03.2015"));

        System.out.println("age(18 - 22) & grade(60, 80)");
        studentList.stream()
                .filter(student -> student.getAge() >= 18 && student.getAge() <= 22)
                .filter(student -> student.getGrade() >= 60 && student.getGrade() <= 80)
                .map(Student::getName)
                .forEach(System.out::println);
        System.out.println();

        List<Student> studentListWithIncreasedGrades = new ArrayList<>(studentList);
        studentListWithIncreasedGrades.forEach(
                student -> student.setGrade(
                        // divide grade to 20 to get 5% of grade and multiply by 23 to increase it by 15%
                        student.getGrade() / 20 * 23 < 80 ?
                                student.getGrade() / 20 * 23 :
                                student.getGrade()
                )
        );

        Map<Integer, List<Student>> studentsGroupedByBirthYear = new HashMap<>();
        studentList.forEach(student ->
                studentsGroupedByBirthYear.computeIfAbsent(
                        student.getBirthYear(), k -> new ArrayList<>()
                ).add(student)
        );

        studentsGroupedByBirthYear.forEach(
                (key, studentsList) ->
                        System.out.printf("students birth year: %s, count: %s \n", key, studentsList.size())
        );
        System.out.println();

        List<Double> studentsGradesList = studentList.stream()
                .filter(student -> student.getAge() > 20)
                .map(Student::getGrade)
                .toList();

        System.out.printf(
                "average of grades of students older than 20 years: %s \n",
                (studentsGradesList.stream().mapToDouble(Double::doubleValue).sum() /
                        studentsGradesList.size())
        );

        System.out.printf(
                "is all students grades in collection higher than 45: %s \n",

                (studentList.stream()
                        .allMatch(student -> student.getGrade() > 45)
                )
        );

        studentList.stream()
                .min(
                        (student1, student2) ->
                                (Double.compare(student1.getGrade(), student2.getGrade()))
                ).ifPresent(
                        student -> System.out.printf("student with min grade: %s \n", student));

        String sortedStudentsNames = studentList.stream()
                .sorted(
                        (student1, student2) ->
                                student1.getName().compareTo(student2.getName())
                ).map(
                        student -> "%s, ".formatted(student.getName())
                ).reduce((s1, s2) -> s1 + s2)
                .toString();
        System.out.println(sortedStudentsNames);

        Map<String, List<Student>> studentsSortedByGrades = new HashMap<>(Map.of(
                "<60", new ArrayList<>(),
                "60-70", new ArrayList<>(),
                ">70", new ArrayList<>()
        ));
        studentList.forEach(student ->
                studentsSortedByGrades.get(
                        (student.getGrade() < 60 ? "<60" : student.getGrade() > 70 ? ">70" : "60-70")
                ).add(student)
        );
        studentsSortedByGrades.forEach((key, value) -> {
            System.out.println(key);
            value.forEach(System.out::println);
        });

        studentList.stream()
                .min(Comparator.comparingInt(Student::getAge))
                .ifPresent(student -> System.out.printf("youngest student : %s \n", student));
    }
}
