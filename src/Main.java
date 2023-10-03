import Interface.*;
import Interface.Client.*;

import static Interface.Client.*;

public class Main {
public static void main(String[]args){
        System.out.println("Hello"+" "+ client.getSurname()+" "+ client.getName()+" "+ client.getMidName()+"\nYour data for contacting you:\n"+"Mobile number:"+ client.getNumber()+"\nYour mail:"+ client.getMail()+"\nYour telegram:"+ client.getTg());
        System.out.println("Your order is in the "+Storage.storage.getProduct_category()+" number "+Storage.storage.getNumb()+" on the street "+Storage.storage.getStreet()+"(coordinates: "+Storage.storage.getCordinate()+")"+"\nThe warehouse is working "+Storage.storage.getSchedule()+" so the order will be packed as quickly as possible :)");
        System.out.println("The car with your order will leave the street according to our estimates "+Storage.storage.getStreet()+" on the highway "+Route.route.getHighway()+"\nThe distance is ~"+Route.route.getDistance()+"\nApproximate time of arrival: "+Route.route.getTime());
        System.out.println("A car is coming to you "+Car.car.getBrand()+"\nAt this moment, he is "+Car.car.getGps()+"\nDeparture time: "+Car.car.getTime());
        System.out.println("A supplier is working on your order "+ Supplier.supplier.getName()+" "+Supplier.supplier.getSurname()+" "+Supplier.supplier.getMidName()+"\nWorks in the warehouse "+Supplier.supplier.getNumb1()+" and sends the goods to the branch number " + Supplier.supplier.getNumb2()+"\nContact number:"+Supplier.supplier.getPhonenumb());
        System.out.println("The order of your order is "+ Order.order.getProduct()+" the road costs "+Order.order.getRoute()+" and the service fee is "+Order.order.getMaintenance());
        System.out.println("If you have any questions, please contact our manager "+ Manager.manager.getSurname()+" "+Manager.manager.getName()+" "+Manager.manager.getMidName()+"\nContact number:"+Manager.manager.getNumber());
       client.addClient(client);
       client.addClient(client2);
       client.addClient(client3);
       Manager.manager.count();
        }
}

