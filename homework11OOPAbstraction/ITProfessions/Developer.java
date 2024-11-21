package homework11OOPAbstraction.ITProfessions;

abstract class Developer extends ITWorker {
    protected String[] idesList;

    public Developer(String name, String surname, String[] skills, String[] idesList) {
        super(name, surname, skills);
        this.idesList = idesList;
    }

    public String[] getIdesList() {
        return idesList;
    }

    public abstract boolean doHealthCheck();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}


