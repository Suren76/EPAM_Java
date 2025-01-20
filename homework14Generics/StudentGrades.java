package homework14Generics;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.Objects;

public class StudentGrades implements Comparable<StudentGrades> {
    private int mathKnowledge;
    private int physicsKnowledge;
    private int historyKnowledge;
    private String name;

    public StudentGrades(int mathKnowledge, int physicsKnowledge, int historyKnowledge, String name) {
        this.mathKnowledge = mathKnowledge;
        this.physicsKnowledge = physicsKnowledge;
        this.historyKnowledge = historyKnowledge;
        this.name = name;
    }

    public int getMathKnowledge() {
        return mathKnowledge;
    }

    public int getPhysicsKnowledge() {
        return physicsKnowledge;
    }

    public int getHistoryKnowledge() {
        return historyKnowledge;
    }

    public String getName() {
        return name;
    }

    public int getTotalGrade() {
        return getHistoryKnowledge() + getMathKnowledge() + getPhysicsKnowledge();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        StudentGrades that = (StudentGrades) o;
        return getMathKnowledge() == that.getMathKnowledge() && getPhysicsKnowledge() == that.getPhysicsKnowledge() && getHistoryKnowledge() == that.getHistoryKnowledge() && Objects.equals(getName(), that.getName());
    }

    @Override
    public int compareTo(StudentGrades otherStudentGrades) {
        return getTotalGrade() > otherStudentGrades.getTotalGrade() ? 1:
                getTotalGrade() == otherStudentGrades.getTotalGrade() ? 0:
                -1;
    }

    @Override
    public String toString() {
        return "StudentGrades{" +
                "mathKnowledge=" + mathKnowledge +
                ", physicsKnowledge=" + physicsKnowledge +
                ", historyKnowledge=" + historyKnowledge +
                ", totalGrade=" + getTotalGrade() +
                ", name='" + name + '\'' +
                '}';
    }
}
