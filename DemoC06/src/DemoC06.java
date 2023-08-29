import java.util.Scanner;

public class DemoC06 {
    public static void main(String[] args) { // psvm | main + tab
        /*
        int a;
        a = 30;
        //<=> int a = 30;
        // Muốn sử dụng biến trong Java thì biến phải được khai báo và có giá trị.
        System.out.println(a);

        int b = 10, c = 20, d = 30; // Khai báo 3 biến b,c,d có cùng kiểu dữ liệu.
        System.out.println("Xin chào thế giới"); // sout + tab


        //int class; // Không được khai báo trùng key java.

        // Kiểu dữ liệu
        // số: int  |||  số thập phân: double
        // chuỗi : String
        // boolean: boolean
        // char: ký tự (character)
        float f = 5.6f;
        int number = 1;
        double number2 = 5.6;
        String string = "Dân";
        char ch = 'l';
        boolean bl = true;

         */


        // Các toán tử: Toán tử toán học, toán tử so sánh, toán tử logic, toán tử gán.

        //Toán tử toán học: +, -, *, /, %, ++, --
        // Tiền tố: tăng trước gán sau;
//        int a = 5;
//        int b = ++a; // b = 6; a = 6;
//        System.out.println(a);
//        System.out.println(b);

        //Hậu tố: Gán trước tăng sau;
//        int a = 5;
//        int b = a++;
//        System.out.println(a); // a = 6
//        System.out.println(b); // b = 5

        /*
        int a = 5;
        int b = 6;
        int c = a / b;
        System.out.println(a + b); // 11
        System.out.println(a - b); // -1
        System.out.println(a * b); // 30
        System.out.println(c); // 0
        System.out.println(a % b); // 5

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);

        // Gán: =, += , -=, *=, /= , %=
        // Logic: &&, ||, !, &, |
        // System.out.println(true | true);

         */

        /*
        Scanner input = new Scanner(System.in); // Đối tượng cho cho phếp tương tác dữ liệu
        Scanner inputString = new Scanner(System.in);
        System.out.println("Nhập a đi: ");
        // int a = input.nextInt();
        // String a = input.nextLine(); // Cho phép nhập chuỗi
        //double a = input.nextDouble();

        int a = input.nextInt(); // \n
        System.out.println("Nhập chuỗi b đi: ");
        String b = inputString.nextLine(); // ""
        System.out.println("Giá trị là: ");
        System.out.println(a);
        System.out.println(b);
         */

        // Nhập điểm in ra giỏi nếu điểm lớn > 90;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhập điểm: ");
//        double score = input.nextDouble();
//        if(score > 90) {
//            System.out.println("Giỏi");
//        } else {
//            System.out.println("Kém");
//        }

//        if(score > 90 && score <= 100) {
//            System.out.println("Giỏi");
//        } else if (score <= 90 && score >= 70) {
//            System.out.println("Khá");
//        } else {
//            System.out.println("Dốt");
//        }

        Scanner inputString = new Scanner(System.in);
        System.out.print("Nhập tên đi: ");
        String name = inputString.nextLine();
        switch (name) {
            case "C06":
                System.out.println("Chào C06");
                break;
            case "Dân":
                System.out.println("CHị gái Dân xinh");
                break;
            default:
                System.out.println("Linh không đẹp trai");
                break;
        }
    }
}
