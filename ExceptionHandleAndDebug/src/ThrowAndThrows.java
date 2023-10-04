import java.io.IOException;

public class ThrowAndThrows {
    public static void main(String[] args) {
//        try {
//            demoThrows();
//        } catch (IOException exception) {
//            System.out.println(exception.getMessage());
//        }

        try {
            demoThrow();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Hello c06");
    }

    // Throw: là từ khóa để ném ra MỘT đối tượng ngoại lệ;
    public static int demoThrow() throws IOException {
        //throw new ArithmeticException("/ zero");
        throw new IOException("Lỗi này");
    }

     //Throws: là một từ khóa khai báo CÁC ngoại lệ có thể sinh ra trong hàm đó
    /*
    public static void demoThrows() throws IOException {
        System.out.println("Hello");

    }
     */


}
