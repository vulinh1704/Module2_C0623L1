import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số : ");
        int dauVao = input.nextInt();
        String docSo = "";


        int tram = dauVao / 100;
        if(tram != 0) {
            docSo += layChuoi(tram);
            docSo += " trăm ";
        }

        int chuc = (dauVao / 10) % 10;
        if(chuc != 0) {
            docSo += layChuoi(chuc);
            docSo += " mươi ";
        }
        if(tram != 0 && chuc == 0) {
            docSo += " linh ";
        }

        int donVi = dauVao % 10;
        docSo += layChuoi(donVi);
        System.out.println(docSo);
    }

    public static String layChuoi(int so) {
        String chuoi = "";
        switch (so) {
            case 1:
                chuoi = "Một";
                break;
            case 2:
                chuoi = "Hai";
                break;
            case 3:
                chuoi = "Ba";
                break;
            case 4:
                chuoi = "Bốn";
                break;
        }
        return chuoi;
    }
}
