package abstract_class;

public abstract class Animal { // Khai báo một lớp trừu tượng
    // Có thuộc tính và phương thức một lớp thường và chứa các phương abstract
    // Không thể sử dụng chung từ khóa final + abstract

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();
    // Khai báo một thức abstract
    // Phương thức abstract chỉ nằm trong class abstract


    public abstract void go();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
