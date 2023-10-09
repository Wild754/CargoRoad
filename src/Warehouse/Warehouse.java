package Warehouse;

public class Warehouse {
    public String street;
    public String numb;
    public Warehouse(String NewStreet, String numb){
        this.street = NewStreet;
        this.numb = numb;
    }

    public void setNumb(String numb) {
        this.numb = numb;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public String getNumb() {
        return numb;
    }
    public static Warehouse warehouse = new Warehouse("Soborna", "A443");
    public static Warehouse warehouse2= new Warehouse("Dekabristov", "A953");
    public static Warehouse warehouse3 = new Warehouse("Ocean", "G874");
}
