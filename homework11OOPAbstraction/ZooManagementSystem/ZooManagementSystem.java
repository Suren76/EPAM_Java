package homework11OOPAbstraction.ZooManagementSystem;

public class ZooManagementSystem {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Lion("Simba", 5);
        animals[1] = new Elephant("Dumbo", 10);
        animals[2] = new Monkey("Kong", 3);

        for (Animal animal : animals) {
            animal.makeSound();
            animal.eat();

            if (animal instanceof TrickPerformer) {
                ((TrickPerformer) animal).performTrick();
            } else {
                System.out.println(animal.name + " doesn't know any tricks.");
            }

            System.out.println();
        }
    }
}
