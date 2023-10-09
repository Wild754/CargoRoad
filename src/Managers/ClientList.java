package Managers;

import Clients.Client;
import Storages.Storage;

import java.util.ArrayList;

public class ClientList extends Manager{
    public static int clientCount = 0;
    public static ArrayList <Client> clients = new ArrayList<>();
    public ClientList(String newName, String newSurname, String newMidName, String numb, String mail, String tg) {
        super(newName, newSurname, newMidName, numb, mail, tg);
    }

    public static void ClientList(ArrayList<Client> clients) {
        for (Client client : clients) {
            System.out.println("Им`я: " + client.getName());
            System.out.println("Призвисько: " + client.getSurname());
        }
    }
}
