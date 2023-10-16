package input;

import java.util.Scanner;

public class Input {
    private static Scanner input = new Scanner(System.in);

    public static int getInputInt() {
        int number;
        while (true) {
            try {
                number = Integer.parseInt(input.nextLine());
                return number;
            } catch (NumberFormatException exception) {
                System.out.println("Vui lòng nhập số: ");
            }
        }
    }

    public static String getInputString() {
        return input.nextLine();
    }

    public static int checkId() {
        String regexId = "^[0-9]{2,4}$";
        while (true) {
            System.out.println("Nhập id: ");
            String id =input.nextLine();
            if(id.matches(regexId)) {
                return Integer.parseInt(id);
            } else {
                System.out.println("Sai định dạng, nhập lại id (2 - 4 ký tự số)");
            }
        }
    }

    public static void main(String[] args) {
        checkId();
    }
}
