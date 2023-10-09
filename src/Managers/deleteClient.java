package Managers;

import Clients.Client;

import static Managers.ClientList.*;


public class deleteClient extends Manager{
    public deleteClient(String newName, String newSurname, String newMidName, String numb, String mail, String tg) {
        super(newName, newSurname, newMidName, numb, mail, tg);
    }

    public void deleteClients(Client client) {
        clientCount--;
        clients.remove(client);
        System.out.println("Клієнт " + client.getName() + (" ") + client.getSurname() + " був видалений з колекції. \nКлієнтів в базі: " + clientCount);
    }
}
