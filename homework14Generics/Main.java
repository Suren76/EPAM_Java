package homework14Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static homework14Generics.IsElementExistsOnList.isElementExistsOnList;


public class Main {
    public static void main(String[] args) {
        ArrayList<StudentGrades> studentGradesList = new ArrayList<>();
        StudentGrades studentGradesToCheckIsItContainsInList = new StudentGrades(
                6, 95, 9, "Styopik04"
        );

        studentGradesList.add(
                new StudentGrades(69, 75, 1, "Suren07")
        );
        studentGradesList.add(
                new StudentGrades(60, 71, 100, "Samvel06")
        );
        studentGradesList.add(
                new StudentGrades(6, 7, 10, "Marlen03")
        );
        studentGradesList.add(studentGradesToCheckIsItContainsInList);


        Collections.sort(studentGradesList);

        System.out.println("--- studentGradesList ---");
        studentGradesList.forEach(System.out::println);

        System.out.println(
                "\n" +
                "isElementExistsOnList: " +
                isElementExistsOnList(
                        studentGradesList,
                        studentGradesToCheckIsItContainsInList
                )
        );
    }
}
