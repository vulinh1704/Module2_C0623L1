package abstract_class;

public abstract class A extends Animal {
    // Khi một lớp abstract kế thừa một lớp abstract
    // sẽ không phải triển khai các phuoưng thức abstract ở lớp cha
    public A(String name, int age) {
        super(name, age);
    }

    public abstract void run();
}

class B extends A {

    public B(String name, int age) {
        super(name, age);
    }

    @Override
    public void run() {

    }

    @Override
    public void makeSound() {

    }

    @Override
    public void go() {

    }
}

