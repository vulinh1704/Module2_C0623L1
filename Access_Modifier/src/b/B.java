package b;
import a.A;

public class B extends A {

    public void go2() {
        System.out.println(name);
    }
}

// public: cho phép truy cập thuộc tính và phương thức ở bất cứ đâu trong chương trình.
// default: cho phép truy cập thuộc tính và phương của lớp đó ở trong cùng một package.
// private: cho phép truy cạp thuộc tính và phương thức của lớp đó trong 1 lớp.
// protected: cho phép truy cập thuộc tính và phương thức của lớp đó trong cùng một package nếu ngoài package thì nó phải trong mối quan hệ kế thừa


