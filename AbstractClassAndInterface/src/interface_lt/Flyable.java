package interface_lt;


public interface Flyable { // Cú pháp khai báo interface
    static final String name = "Linh"; // Mặc định thuộc tính trong interface là final static
    public abstract String fly(); // Mặc định các phương thức trong interface là public abstract

    static int getA() {
        return 1;
    }

    default void show() {
        System.out.println("Abc");
    }
}

interface Animal {
    void eat();
    String fly();
}

class Plane implements Flyable {

    @Override
    public String fly() {
        return "Máy bay đang bay";
    }
}

class Bird implements Flyable, Animal {
    // Interface hỗ trợ đa kế thừa
    // Khi một lớp non-abstract implement interface sẽ phải triển
    // khai tất cả các phương thức có ở interface

    @Override
    public String fly() {
        return "Chim đang bay";
    }


    @Override
    public void eat() {

    }

    @Override
    public void show() {
        Flyable.super.show();
    }
}

class Main {
    public static void main(String[] args) {
        // Flyable flyable = new Flyable();
        // Không thể khởi tạo đối tượng từ Interface
        System.out.println(Flyable.name);

        Bird bird = new Bird();
        System.out.println(bird.fly());
        Flyable.getA();
    }
}