public class Person{ // Tên lớp (public) phải trùng với tên file java và đặt theo quy tắc PascalCase
    public String name = "Linh";
    // Khởi tạo các thuộc tính nếu không gán giá trị thì nó sẽ là giá trị mặc đinh
    // String: null; int: 0, double: 0.0
    public int age;

    // constructor: hàm tạo sử dụng tạo các đối tượng
    // Có thể constructor trong 1 lớp (chú ý: các constructor phải khác nhau tham số truyền vào)
    // Nếu không có constructor nào thì lớp đó sẽ tự tạo 1 constructor rỗng
    public Person() {
        this.name = "Linh";
        this.age = 22;
    }

    public Person(int ageInput, String nameInput) {
        this.name = nameInput;
        this.age = ageInput;
    }

    public void go() {
        System.out.println(this.name + " đang đi bộ");
        // Từ khóa this đại diện cho đối tượng đang sử dụng
    }

    @Override
    public String toString() {
        return "Người này có tên là " + this.name + " và có tuổi là: " + this.age;
    }
}



