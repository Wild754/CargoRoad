import Interface.*;

public class Main {

    public static void main(String[] args) {
        Client client = new Client("Andrew", "Baklan","Olekandrovich","0990804632","andrejbaklan25@gmail.com","@backlandly");
        Manager manager = new Manager("Ivan", "Burlachenko", "Sergiyovich","0687946379");
        Storage storage = new Storage("Krylov 19g","46.95251547486493, 31.95676951344289","5100 square meter","Product composition","324","daily from 8:00 to 21:00");
        Supplier supplier = new Supplier("Rayan","Gosling","Andriyovich","324","552","0689485743");
        Route route = new Route("","M14","135km","8 hour");
        Car car = new Car("Jack","400","46.98436050188412, 31.90064209839257","20:00");
        Order order = new Order("10.000","2.000","2.500");
        System.out.println("Hello" + " " + client.getSurname() + " " +  client.getName() +" " +  client.getMidName() + "\nYour data for contacting you:\n" + "Mobile number:" + client.getNumber() + "\nYour mail:" + client.getMail() + "\nYour telegram:" + client.getTg());
        System.out.println("Your order is in the " + storage.getProduct_category() + " number " + storage.getNumb() + " on the street " + storage.getStreet() + "(coordinates: " + storage.getCordinate() + ")" + "\nThe warehouse is working " + storage.getSchedule() + " so the order will be packed as quickly as possible :)");
        System.out.println("The car with your order will leave the street according to our estimates " + storage.getStreet() + " on the highway " + route.getHighway() + "\nThe distance is ~" + route.getDistance() + "\nApproximate time of arrival: " + route.getTime() );
        System.out.println("A car is coming to you " + car.getBrand() + "\nAt this moment, he is "+ car.getGps() + "\nDeparture time: "+ car.getTime() );
        System.out.println("A supplier is working on your order " + supplier.getName() + " " + supplier.getSurname() + " " + supplier.getMidName() + "\nWorks in the warehouse " + supplier.getNumb1() + " and sends the goods to the branch number " + supplier.getNumb2() + "\nContact number:" + supplier.getPhonenumb());
        System.out.println("The order of your order is " + order.getProduct() + " the road costs "+ order.getRoute() + " and the service fee is " + order.getMaintenance());
        System.out.println("If you have any questions, please contact our manager " + manager.getSurname() + " " + manager.getName() + " " + manager.getMidName() + "\nContact number:" + manager.getNumber());
    }
}