package ly_thuyet;


import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

class Product implements Serializable {
    private int id;
    private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Product product = new Product(1, "Bánh mì");
        File file = new File("data.dat");
//        FileOutputStream outputStream = new FileOutputStream(file);
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
//        objectOutputStream.writeObject(product);

//        FileInputStream inputStream = new FileInputStream(file);
//        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
//        Product productFile = (Product) objectInputStream.readObject();
//        System.out.println(productFile.getId() + productFile.getName());

//        ArrayList<Product> list = new ArrayList<>();
//        list.add(new Product(1, "Dân"));
//        list.add(new Product(2, "Mai"));
//        list.add(new Product(3, "Nộc"));
//        list.add(new Product(4, "Đức"));
//        FileOutputStream fileOutputStream = new FileOutputStream(file);
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//        objectOutputStream.writeObject(list);

//        FileInputStream fileInputStream = new FileInputStream(file);
//        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
//        ArrayList<Product> products = (ArrayList<Product>) inputStream.readObject();
//        for (Product product: products) {
//            System.out.println(product.getId() + " " + product.getName());
//        }
    }
}
