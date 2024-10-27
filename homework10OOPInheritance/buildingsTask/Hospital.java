package homework10OOPInheritance.buildingsTask;

import homework10OOPInheritance.People;
import homework10OOPInheritance.PeoplesList;

public class Hospital {
    private HospitalBuilding hospitalBuilding;
    private String[] illnessList = {"Pneumonia", "Appendicitis", "Myocardial Infarction (Heart Attack)",
            "Stroke", "Kidney Failure"};
    private PeoplesList employees;

    private Hospital(HospitalBuilding hospitalBuilding, PeoplesList employees) {
        this.hospitalBuilding = hospitalBuilding;
        this.employees = employees;
    }

    public Hospital(int drainageSystemOutsCount, int electricitySystemVoltage, int hospitalRoomsCount, int employeesCount) {
        this(new HospitalBuilding(drainageSystemOutsCount, electricitySystemVoltage, hospitalRoomsCount),
                new PeoplesList(employeesCount)
        );
    }

    public String[] getIllnessList() {
        return illnessList;
    }

    private void addEmployee(People employee) {
        employees.append(employee);
    }

    public void addEmployee(String name, String surname, int age) {
        addEmployee(new People(name, surname, age));
    }

    private void removeEmployee(People people) {
        System.out.println("removing " + people + " from employees list");
        employees.remove(people);
    }

    public void removeEmployee(String name, String surname) {
        removeEmployee(new People(name, surname));
    }

    public int getEmployeesCount() {
        return employees.elementsCount();
    }
}
