public class Runable {
    public static void main(String[] args) {

        /*
        Tạo đối tượng
          Person p = new Person();
          System.out.println(p.name);
          System.out.println(p.age);
         */

        /*
       // Biến cục bộ thì không có giá trị mặc đinh
       // Phải gán trước khi sử dụng
       int a;
       a = 10;
       System.out.println(a);
         */

        Person p = new Person();
        p.go(); // Linh đang đi bộ

        Person p2 = new Person(23, "Dân");
        p2.go(); // Dân đang đi bộ

        System.out.println(p2);
    }
}

