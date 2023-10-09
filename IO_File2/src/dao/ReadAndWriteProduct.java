package dao;

import model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteProduct {
    private File file = new File("products.csv");

    public List<Product> readFile() {
        List<Product> products = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                // 1,Mai,100,1,Vip
                String[] data = line.split(","); // ["1", Mai, "100", "1", Vip]
                Product product = new Product(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), data[4]);
                products.add(product);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;
    }


    public void writeFile(List<Product> productList) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String data = "";
            for (Product product : productList) {
                data += product.getId() + "," + product.getName()
                        + "," + product.getPrice() + "," + product.getQuantity()
                        + "," + product.getCategory() + "\n";
            }
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
