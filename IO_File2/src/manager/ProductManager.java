package manager;

import dao.ReadAndWriteProduct;
import model.Product;

import java.util.List;

public class ProductManager implements IManager<Product> {
    List<Product> productList;
    ReadAndWriteProduct readAndWriteProduct = new ReadAndWriteProduct();

    public ProductManager() {
        this.productList = readAndWriteProduct.readFile();
    }

    @Override
    public boolean add(Product product) {
        this.productList.add(product);
        readAndWriteProduct.writeFile(this.productList);
        return true;
    }

    @Override
    public boolean edit(int id, Product product) {
        int index = findById(id);
        if (index == -1) return false;
        this.productList.set(index, product);
        readAndWriteProduct.writeFile(this.productList);
        return true;
    }

    @Override
    public boolean delete(int id) {
        int index = findById(id);
        if (index == -1) return false;
        this.productList.remove(index);
        readAndWriteProduct.writeFile(this.productList);
        return true;
    }

    @Override
    public int findById(int id) {
        for (int i = 0; i < this.productList.size(); i++) {
            if (this.productList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public List<Product> findAll() {
        return this.productList;
    }
}
