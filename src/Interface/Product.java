package Interface;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private String count;
    private String category;

    public Product(String newProd, String countProd, String categoryProd) {
        this.name = newProd;
        this.count = countProd;
        this.category = categoryProd;
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
    public static class ProdList extends Product {
        public List<Product> products;

        public ProdList(String newProd, String countProd, String categoryProd) {
            super(newProd, countProd, categoryProd);
            this.products = new ArrayList<>();
        }
    }
    public static int ProductCount = 0;
        public void addProd() {
            ProdList.ProductCount++;
            if (ProductCount == 1){
                System.out.println("Товар додано до кошика.");
                System.out.println("В вашому кошику " + ProductCount + " позиція");

            }
            if(ProductCount >= 2 && ProductCount < 5){
                System.out.println("Товар додано до кошика.");
                System.out.println("В вашому кошику " + ProductCount + " позиції");

            }
            if(ProductCount >= 5) {
                System.out.println("Товар додано до кошика.");
                System.out.println("В вашому кошику " + ProductCount + " позицій");

            }
        }

    public static Product product = new Product("Fruits", "5 kg", "Grocery product");
}



