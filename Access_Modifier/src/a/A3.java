package a;

public class A3 {
    private String name;
    private int age;

    public int getAge() { // getter
        return this.age;
    }

    public void setAge(int age) { // setter
        this.age = age;
    }
}

class Main {
    public static void main(String[] args) {
        A3 a = new A3();
        a.setAge(45);
        System.out.println(a.getAge());
    }
}
