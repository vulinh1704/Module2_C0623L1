import java.util.Scanner;

public class SoThanhChu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int so = input.nextInt();
        String chuoi = ""; // 139

        int tram = so / 100;
        chuoi += layChuoi(tram) + " trăm ";

        int chuc = (so / 10) % 10;
        if(chuc == 1) {
            chuoi += "Mười ";
        } else if (chuc == 0) {
            chuoi = "";
        } else {
            chuoi += layChuoi(chuc) + " mươi ";
        }
        int donVi = so % 10; //9
        chuoi += layChuoi(donVi);
        System.out.println(chuoi);
    }

    public static String layChuoi(int so) {
        switch (so) {
            case 1:
                return "Một";
            case 2:
                return "Hai";
            case 3:
                return "Ba";
            case 4:
                return "Bốn";
            case 5:
                return "Năm";
            case 6:
                return "Sáu";
            case 7:
                return "Bảy";
            case 8:
                return "Tám";
            case 9:
                return "Chín";
            default:
                return "";
        }
    }
}
