public class Chrome {
    private String nameWeb;
    static public int count;

    static {
        System.out.println("Linh is handsome");
    }

    public Chrome(String nameWeb) {
        this.nameWeb = nameWeb;
        count++;
    }

    public String getNameWeb() {
        getHTTP();
        return nameWeb;
    }

    public void setNameWeb(String nameWeb) {
        this.nameWeb = nameWeb;
    }

    public static void getHTTP() {
        System.out.println("Http là: https//:...");
    }
}

class Main {
    public static void main(String[] args) {
        Chrome web1 = new Chrome("James");
        System.out.println(web1.getNameWeb());
        Chrome web2 = new Chrome("Ken");
        System.out.println(web2.getNameWeb());
        System.out.println(Chrome.count);
        Chrome.getHTTP();
    }
}

// Static: là từ khóa để khai các thuộc tính và phương cho LỚP (Không phải đối tượng)
// Truy cập thuộc tính hoặc phương thức static sử dụng tên class.
// Phương thức static thì không sử dụng được từ khóa this hoặc super.
// Phương thức static thì không truy cập được vào các thuộc tính và phương thức non-static (ngược lại: phương non-static có thể truy cập các thành phần dữ liệu static)


