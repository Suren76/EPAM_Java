package homework10OOPInheritance.buildingsTask;

public class Main {
    public static void main(String[] args) {
        int drainageSystemOutsCount = 5;
        int electricitySystemVoltage = 240;

        int hospitalRoomsCount = 12*3;
        int hospitalEmployeesCount = 10;

        int studentsMaxCountToAdd = 15;
        int teachersMaxCountToAdd = 15;

        Hospital hospital = new Hospital(drainageSystemOutsCount, electricitySystemVoltage, hospitalRoomsCount, hospitalEmployeesCount);

        hospital.addEmployee("Peter", "Pan", 35);
        hospital.addEmployee("Peter1", "Pan1", 35);
        hospital.addEmployee("Peter2", "Pan2", 35);
        System.out.println(hospital.getEmployeesCount());
        hospital.removeEmployee("Peter", "Pan");
        System.out.println(hospital.getEmployeesCount());

        School school = new School(drainageSystemOutsCount, electricitySystemVoltage, studentsMaxCountToAdd,
                teachersMaxCountToAdd);

        school.addStudent("Պողոս", "Մարտիրոսյան", 15);
    }
}
