package Managers;

import Clients.Client;

import static Managers.ClientList.*;

public class addClient extends Manager {
    public addClient(String newName, String newSurname, String newMidName, String numb, String mail, String tg) {
        super(newName, newSurname, newMidName, numb, mail, tg);
    }

    public static void addClient(Client client) {
        clientCount++;
        clients.add(client);
        System.out.println("Клієнт " + client.getName() + (" ") + client.getSurname() + " був доданий до колекції. \nКлієнтів в базі: " + clientCount);
    }
}
