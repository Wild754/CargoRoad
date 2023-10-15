/*package Supplier;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import Interface.Product;
import Storages.Storage;


public class SupStor extends waybills{
    private List<Product> products;
    private List<Waybill> waybills;
    private int invoiceCounter;

    public ProductJournal() {
        products = new ArrayList<>();
        invoices = new ArrayList<>();
        invoiceCounter = 1;
    }

    public void addProduct(String name) {
        Product product = new Product(name);
        products.add(product);

        Invoice invoice = new Invoice(invoiceCounter);
        invoices.add(invoice);
        invoiceCounter++;

        System.out.println("Додано продукт: " + name);
        System.out.println("Номер накладної: " + invoice.setInvoiceNumber());
        System.out.println("Час: " + invoice.getTimestamp());
    }
    public static void main(String[] args) {
        ProductJournal journal = new ProductJournal();

        // Додавання продукту до журналу
        journal.addProduct("Продукт 1", 10.0);
        journal.addProduct("Продукт 2", 15.0);
    }
}


*/