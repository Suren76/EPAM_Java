package homework11OOPAbstraction;

class Monkey extends Animal implements TrickPerformer {
    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    public void performTrick() {
        System.out.println(name + " swings from a tree branch!");
    }
}
