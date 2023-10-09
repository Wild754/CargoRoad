package Warehouse;

import Storages.Storage;

import java.util.ArrayList;

public class WareList extends Warehouse {
    public static ArrayList<Warehouse> warehouses = new ArrayList<>();

    public WareList(String NewStreet, String numb) {
        super(NewStreet, numb);
    }

    public static void Warelist(ArrayList<Warehouse> warehouses) {
        warehouses.add(warehouse);
        warehouses.add(warehouse2);
        warehouses.add(warehouse3);
        for (Warehouse warehouse : warehouses) {
            System.out.println(warehouse.getNumb());
        }
    }
}
