import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
//        String a = "Mai";
//        String a2 = "Mai";
//        String b = new String("Mai");
//        String b2 = new String("Mai");
//        System.out.println(a == a2); // True
//        System.out.println(b.equals(b2)); // False
//        System.out.println(a == b2); // False

//        StringBuilder stringBuilder = new StringBuilder("Mai");
//        stringBuilder.append("C06");
//        System.out.println(stringBuilder);

//        String str = "Mai";
//        System.out.println(str.toUpperCase());
//        System.out.println(str.toLowerCase());
//        System.out.println(str.length());
//        System.out.println(str.compareTo("Maii"));
//        System.out.println(str.charAt(0));
//        System.out.println(str.indexOf('x'));
//        System.out.println(str.startsWith("Ma"));
//        System.out.println(str.endsWith("Ma"));
//        System.out.println(str.contains("M"));
//        System.out.println(Arrays.toString(str.split(" ")));
//        System.out.println(str);

        Scanner input = new Scanner(System.in);
        String regex = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
        System.out.println("Nhập ngày sinh: ");
        String date = input.nextLine();
        System.out.println(date.matches(regex));
    }
}
