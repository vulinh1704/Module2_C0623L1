package view;

import manager.StudentManager;
import model.Student;

import java.util.Scanner;

public class Menu {
    private StudentManager studentManager = new StudentManager();
    private Scanner inputInt = new Scanner(System.in);
    private Scanner inputString = new Scanner(System.in);

    public void showMainMenu() {
        int choice;
        do {
            System.out.println("----- Quản lý sinh viên ------\n1.Thêm sinh viên" +
                    "\n2.Xóa sinh viên\n3.Sửa sinh viên\n4.Tìm kiếm theo Id\n5.Hiển thị tất cả\n0.Thoát");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    showMenuAdd();
                    break;
                case 2:

                    break;
                case 3:
                    showMenuEdit();
                    break;
                case 5:
                    showAll();
                    break;
            }
        } while (choice != 0);
    }

    public void showMenuEdit() {
        System.out.println("------- Menu sửa --------");
        System.out.println("Nhập id muốn sửa: ");
        int id = inputInt.nextInt();
        System.out.println("Nhập tên: ");
        String name = inputString.nextLine();
        System.out.println("Nhập giới tính: ");
        String gender = inputString.nextLine();
        System.out.println("Nhập điểm toán: ");
        double math = inputInt.nextDouble();
        System.out.println("Nhập điểm anh: ");
        double english = inputInt.nextDouble();
        System.out.println("Nhập điểm lịch sử: ");
        double history = inputInt.nextDouble();
        Student newStudent = new Student(id, name, gender, math, english, history);
        studentManager.edit(id, newStudent);
        System.out.println("=====> Sửa thành công");
    }

    public void showAll() {
        Student[] students = studentManager.findAll();
        int size = studentManager.getSize();
        System.out.println("Danh sách sinh viên là : ");
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
    }

    public void showMenuAdd() {
        System.out.println("------ Menu thêm mới ------");
        System.out.println("Nhập tên: ");
        String name = inputString.nextLine();
        System.out.println("Nhập giới tính: ");
        String gender = inputString.nextLine();
        System.out.println("Nhập điểm toán: ");
        double math = inputInt.nextDouble();
        System.out.println("Nhập điểm anh: ");
        double english = inputInt.nextDouble();
        System.out.println("Nhập điểm lịch sử: ");
        double history = inputInt.nextDouble();
        Student student = new Student(name, gender, math, english, history);
        studentManager.add(student);
        System.out.println("====> Thêm sinh viên thành công!!!");
    }
}
