package homework10OOPInheritance.buildingsTask;

public class SchoolBuilding extends Building{
    private int studentsCapacity;
    private int teachersCapacity;

    public SchoolBuilding(int drainageSystemOutsCount, int electricitySystemVoltage, int studentsCapacity, int teachersCapacity) {
        super(drainageSystemOutsCount, electricitySystemVoltage);
        setStudentsCapacity(studentsCapacity);
        setTeachersCapacity(teachersCapacity);
    }

    public int getStudentsCapacity() {
        return studentsCapacity;
    }

    public int getTeachersCapacity() {
        return teachersCapacity;
    }

    private void setTeachersCapacity(int teachersCapacity) {
        if (teachersCapacity > 0) {
            this.teachersCapacity = teachersCapacity;
        } else {
            System.out.println("Rooms count can't be less 1");
        }
    }

    private void setStudentsCapacity(int studentsCapacity) {
        if (studentsCapacity > 0) {
            this.studentsCapacity = studentsCapacity;
        } else {
            System.out.println("Rooms count can't be less 1");
        }
    }
}
