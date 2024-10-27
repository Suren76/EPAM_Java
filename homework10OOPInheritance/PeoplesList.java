package homework10OOPInheritance;

public class PeoplesList {
    private static boolean arePeoplesEqual(People people1, People people2) {
        return
                people1.getName().equals(people2.getName()) &&
                people1.getSurname().equals(people2.getSurname());
    }

    private People[] peoplesList;
    private int currentIndex = 0;

    public PeoplesList(People[] peoplesList) {
        setPeoplesList(peoplesList);
    }

    public PeoplesList(int listLength) {
        this(new People[listLength]);
    }

    private void setPeoplesList(People[] peoplesList) {
        this.peoplesList = peoplesList;
    }

    public void append(People people) {
        peoplesList[currentIndex++] = people;
    }

    public void pop() {
        peoplesList[currentIndex--] = null;
    }

    public void remove(People peopleToRemove) {
        currentIndex--;

        People[] newPeoplesList = new People[peoplesList.length];
        int indexToAdd = 0;

        for (People people : peoplesList) {
            if (people == null) break;
            if (arePeoplesEqual(people, peopleToRemove)) continue;
            newPeoplesList[indexToAdd++] = people;
        }

        peoplesList = newPeoplesList;
    }

    public int elementsCount() {
        // with for implementation is more stable
        return currentIndex;
    }

    public boolean isFull() {
        return peoplesList.length == currentIndex;
    }
}
