public class Student {
    public String name;
    public int age;


    public Student() {

    }
    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this(name);
        this.name = name;
        this.age = age;
    }

    public void go() {
        System.out.println(this.name + " Đang đi bộ");
    }

}

class Main {
    public static void main(String[] args) {
        Student sv1 = new Student("Hiếu", 20);
        System.out.println(sv1.name);
        sv1.go();
        Student sv2 = new Student("Dân", 22);
        sv2.go();
    }

}
