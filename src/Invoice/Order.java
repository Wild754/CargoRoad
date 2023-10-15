package Invoice;

public class Order { //  Liskov Substitution
        public static int product;
        public static int route;
        public static int maintenance;
        public Order(int prod, int newRoute, int main){
            this.product = Integer.parseInt(String.valueOf(prod));
            this.route = Integer.parseInt(String.valueOf(newRoute));
            this.maintenance = Integer.parseInt(String.valueOf(main));
        }

        public void setProduct(int product) {
            this.product = product;
        }

        public int getProduct() {
            return product;
        }

        public void setRoute(int route) {
            this.route = route;
        }

        public int getRoute() {
            return route;
        }

        public void setMaintenance(int maintenance) {
            this.maintenance = maintenance;
        }

        public int getMaintenance() {
            return maintenance;
        }
    static Order order = new Order(222, 222, 222);
    public static Order getOrder() {
        return order;
    }
}


