import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Demo {
    int a = 10;
    public static void main(String[] args) {
//        int[] a = new int[]{1,5,6};
//        System.out.println(a[4]);
        Demo demo = null;
        System.out.println(demo.a); // NullPointException
    }

    // Ngoại lệ: là các lỗi xảy ra trong quá trình thực hiện chương trình.
    // Các loại lỗi: cú pháp, runtime, logic

    // Ngoại lệ trong Java (Exception): Là đối tượng sinh ra từ các class có sẵn

    public static void testCheckedException() {
        //Writer writer = new FileWriter("abc");
        // Checked Exception: là ngoại lệ bắt buộc phải xử lý khi viết code
    }

    public static void uncheckedException(){
        System.out.println(5/0);
        // Unchecked Exception: là lỗi xảy ra trong quá trình chạy trường trình
    }
}
