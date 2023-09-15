package abstract_class;

public class Chicken extends Animal {
    public Chicken(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Ò ó o");
    }

    @Override
    public void go() {
    }
}
