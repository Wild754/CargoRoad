package Interface;

public class Car {
    private String brand;
    private String kg; // скільки може повести
    private String gps;
    private String time; // час відбуття
    public Car (String newBrand, String newKg, String newGps,String newTime){
        this.brand = newBrand;
        this.kg = newKg;
        this.gps = newGps;
        this.time = newTime;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public String getKg() {
        return kg;
    }

    public void setKg(String kg) {
        this.kg = kg;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public String getGps() {
        return gps;
    }
}
