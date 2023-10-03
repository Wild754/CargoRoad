package Interface;

public class Route {
    private String street;
    private String highway;
    private String distance; // відстань до транспортних вузлів
    private String time; //приблизний час прибуття
    public Route(String newStreet, String newWay, String dist, String time){
        this.street = newStreet;
        this.highway = newWay;
        this.distance = dist;
        this.time = time;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setHighway(String highway) {
        this.highway = highway;
    }

    public String getHighway() {
        return highway;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getDistance() {
        return distance;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }
   public static Route route = new Route("", "M14", "135km", "8 hour");
}
