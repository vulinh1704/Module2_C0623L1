class A{
    A() {
        System.out.println("Khởi tạo A");
    }
}
public class Demo {
    private static A a ;

    static {
        a = new A();
        System.out.println("Khối static");
    }

    public static void show() {
        System.out.println("Phương thức static");
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        Demo.show();
    }
}
