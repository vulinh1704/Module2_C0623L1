import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int choice;
//        do {
//            System.out.println("1.Thêm mới\n2.Sửa\n3.Xóa\n0.Thoát");
//            System.out.println("Nhập dữ liệu: ");
//            try {
//                choice = input.nextInt(); // \n
//            } catch (InputMismatchException exception) {
//                System.out.println("Sai định dạng nhập lại");
//                input.nextLine();
//                choice = -1;
//            }
//        } while (choice != 0);

        int choice;
        do {
            System.out.println("1.Thêm mới\n2.Sửa\n3.Xóa\n0.Thoát");
            System.out.println("Nhập dữ liệu: ");
            try {
                choice = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException exception) {
                System.out.println("Sai định dạng nhập lại");
                choice = -1;
            }
        } while (choice != 0);
    }
}
