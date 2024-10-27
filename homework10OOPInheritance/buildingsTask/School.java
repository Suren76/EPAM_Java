package homework10OOPInheritance.buildingsTask;

import homework10OOPInheritance.People;
import homework10OOPInheritance.PeoplesList;

public class School {
    private SchoolBuilding schoolBuilding;
    private PeoplesList students;
    private PeoplesList teachers;

    private School(SchoolBuilding schoolBuilding, PeoplesList students, PeoplesList teachers) {
        this.schoolBuilding = schoolBuilding;
        this.students = students;
        this.teachers = teachers;
    }

    public School(int drainageSystemOutsCount, int electricitySystemVoltage, int studentsCount, int teachersCount) {
        this(
                new SchoolBuilding(drainageSystemOutsCount, electricitySystemVoltage, studentsCount, teachersCount),
                new PeoplesList(studentsCount), new PeoplesList(teachersCount)
        );
    }

    private void addStudent(People people) {
        if (students.isFull()) {
            System.out.println("Places are already taken!");
            return;
        }
        students.append(people);
    }

    public void addStudent(String name, String surname, int age) {
        addStudent(new People(name, surname, age));
    }

    public PeoplesList getStudents() {
        return students;
    }

    public PeoplesList getTeachers() {
        return teachers;
    }
}
