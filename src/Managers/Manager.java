package Managers;

import Clients.Client;
import Supplier.Supplier;

import java.util.ArrayList;

import static Supplier.Supplier.supplier;

public class Manager extends Client {
    public Manager(String newName, String newSurname, String newMidName, String numb, String mail, String tg) {
        super(newName, newSurname, newMidName, numb, mail, tg);

    }
    public static Manager manager = new Manager("Ivan", "Burlachenko", "Sergiyovich", "0687946379", "", "");
    public static Manager manager2 = new Manager("neIvan", "neBurlachenko", "Sergiyovich", "0687946379", "", "");
}
