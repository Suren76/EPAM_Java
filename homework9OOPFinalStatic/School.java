package homework9OOPFinalStatic;

public class School {
    public static void main(String[] args) {
        Teacher.setK(2);
        Teacher.setMinSalary(160000);

        Teacher teacher = new Teacher(5);

        System.out.println(teacher.getSalary());
    }
}
