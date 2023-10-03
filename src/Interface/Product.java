package Interface;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String  name;
    private String count;
    private String category;
    public Product(String newProd, String countProd, String categoryProd ){
        this.name = newProd;
        this.count = countProd;
        this. category = categoryProd;
    }

    public String getName() {
        return name;
    }

    public String getCount() {
        return count;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCount(String count) {
        this.count = count;
    }
    public static class ProducttList extends Product {
        public List<Client> products;

        public ProducttList(String newProd, String countProd, String categoryProd) {
            super(newProd, countProd, categoryProd);
            this.products = new ArrayList<>();
        }
    }
    public static void addProd(){
        System.out.println("Товар додано до кошика.");
    }
    public static Product product = new Product("", "", "");
}


