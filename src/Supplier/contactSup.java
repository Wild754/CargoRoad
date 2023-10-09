package Supplier;

import Managers.Manager;

import static Supplier.Supplier.supplier;


public class contactSup extends Manager {
    public contactSup(String newName, String newSurname, String newMidName, String numb, String mail, String tg) {
        super(newName, newSurname, newMidName, numb, mail, tg);
    }

    public void contactSupplier(){
        System.out.println("Manager " + manager.getName() + " is contacting supplier " + supplier.getName());
    }
}
