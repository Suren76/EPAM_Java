package homework11OOPAbstraction.ITProfessions;

public class ProjectManager extends ITWorker {
    public ProjectManager(String name, String surname, String[] skills) {
        super(name, surname, skills);
    }

    @Override
    public void doesWork() {
        System.out.println("Writing tickets.");
    }
}
