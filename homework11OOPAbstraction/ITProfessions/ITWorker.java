package homework11OOPAbstraction.ITProfessions;

abstract class ITWorker {
    protected String name;
    protected String surname;
    protected String[] skills;

    public ITWorker(String name, String surname, String[] skills) {
        this.name = name;
        this.surname = surname;
        this.skills = skills;
    }

    public String[] getSkills() {
        return skills;
    }

    public abstract void doesWork();
}
