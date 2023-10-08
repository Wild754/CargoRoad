package Interface;

public class Storage {
    public String street;
    public String cordinate;
    public String area;
    public String product_category;
    public String numb; // номер складу
    public String schedule;
    public Storage (String newStreet, String cord, String area, String product, String numb, String sch){
        this.street = newStreet;
        this.cordinate = cord;
        this.area = area;
        this.product_category = product;
        this.numb = numb;
        this.schedule = sch;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getStreet() {
        return street;
    }
    public void setCordinate() {
        this.cordinate = cordinate;
    }
    public String getCordinate() {
        return cordinate;
    }
    public void setArea() {
        this.area = area;
    }
    public String getArea() {
        return area;
    }
    public void setProduct_category(String product_category) {
        this.product_category = product_category;
    }
    public String getProduct_category() {
        return product_category;
    }

    public void setNumb() {
        this.numb = numb;
    }

    public String getNumb() {
        return numb;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
    public String getSchedule() {
        return schedule;
    }

    public static Storage storage = new Storage("Krylov 19g", "46.95251547486493, 31.95676951344289", "5100 square meter", "Product composition", "324", "daily from 8:00 to 21:00");

}
