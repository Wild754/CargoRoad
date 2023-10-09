package Managers;

import Clients.Client;

public class infoClient {
    public static void infoClient(Client client) {
        System.out.println("Name: " + client.getName() + "\nSurname: " + client.getSurname() + ("\nMidname: " + client.getMidName() + ("\nNumber: " + client.getNumber() + ("\nProduct: "))));
    }
}
