package Supplier;

import Clients.Client;

import static Storages.Storage.storage;

public class Supplier extends Client {
    private String numb1;
    private String numb2;
    public Supplier(String newName, String newSurname, String newMidName, String numb, String mail, String tg, String newNumb1, String newNumb2){
        super(newName, newSurname, newMidName, numb, mail, tg);
        this.numb1 = newNumb1;
        this.numb2 = newNumb2;
    }
    public void setNumb1(String numb1) {
        this.numb1 = numb1;
    }
    public String getNumb1() {
        return numb1;
    }
    public void setNumb2(String numb2) {
        this.numb2 = numb2;
    }
    public String getNumb2() {
        return numb2;
    }


    public static Supplier supplier = new Supplier("Rayan", "Gosling", "Andriyovich", "","","","","");
    public static Supplier supplier2 = new Supplier("2wsdq", "Gosling", "Andriyovich", "","","","","");
    public static Supplier supplier3 = new Supplier("Rcsfg", "Gosling", "Andriyovich", "","","","","");
    public static Supplier supplier4 = new Supplier("gbfsds", "Gosling", "Andriyovich", "","","","","");
}
