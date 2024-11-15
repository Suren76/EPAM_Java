package homework11OOPAbstraction;

abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Makes a "+ name +" sound.");
    }

    public void eat() {
        System.out.println("Eats "+ name +" food.");
    }
}
