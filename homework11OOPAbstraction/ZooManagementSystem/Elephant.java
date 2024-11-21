package homework11OOPAbstraction.ZooManagementSystem;

class Elephant extends Animal implements TrickPerformer {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void performTrick() {
        System.out.println(name + " balances on one leg!");
    }
}
