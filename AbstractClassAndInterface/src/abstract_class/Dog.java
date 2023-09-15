package abstract_class;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    /*
    Một lớp con không phải abstract class sẽ phải triển khai
    tất cả phương thức abstract của lớp cha

    Không bắt buộc phải triển khai các phương thức non-abstract ở lớp cha
     */
    @Override
    public void makeSound() {
        System.out.println("Gâu gâu");
    }

    @Override
    public void go() {

    }

}
