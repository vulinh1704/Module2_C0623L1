import java.util.Scanner;

public class DemoJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int a = scanner.nextInt();
        System.out.println("Nhập chuỗi: ");
        String b = scanner.nextLine();
        System.out.println(a);
        System.out.println(b);
    }
}
