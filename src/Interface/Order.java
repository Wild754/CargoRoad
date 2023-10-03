package Interface;

public class Order { // перейменувати на order/invoice
    private String product;
    private String route;
    private String maintenance; // обслуговування
    public Order(String prod, String newRoute, String main){
        this.product = prod;
        this.route = newRoute;
        this.maintenance = main;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getRoute() {
        return route;
    }

    public void setMaintenance(String maintenance) {
        this.maintenance = maintenance;
    }

    public String getMaintenance() {
        return maintenance;
    }
}
