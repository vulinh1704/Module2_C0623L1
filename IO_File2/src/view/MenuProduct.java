package view;

import input.Input;
import manager.ProductManager;

public class MenuProduct {
    ProductManager productManager = new ProductManager();

    public void showMainMenu() {
        int choice;
        do {
            System.out.println("======= Main Menu =======\n1.Thêm mới\n2.Sửa\n3.Xóa\n4.Hiển thị tất cả\n0.Thoát");
            System.out.println("Nhập lựa chọn: ");
            choice = Input.getInputInt();
            switch (choice) {
                case 1:
                    showFormAdd();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Đ có lựa chọn này! Nhập lại");
            }
        } while (choice != 0);
    }

    public void showFormAdd() {
        System.out.println("Nhập id: ");
        int id = Input.getInputInt();
        System.out.println("Nhập tên: ");
        String name = Input.getInputString();
    }
}
