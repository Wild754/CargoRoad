package Interface;

import java.util.ArrayList;
import java.util.Objects;

import static Interface.Manager.ClientList.clients;

public class Manager extends Client {
    public Manager(String newName, String newSurname, String newMidName, String numb, String mail, String tg) {
        super(newName, newSurname, newMidName, numb, mail, tg);
    }

    public static class ClientList extends Client {
        public static ArrayList<Client> clients = new ArrayList<>();

        public ClientList(String newName, String newSurname, String newMidName, String numb, String mail, String tg) {
            super(newName, newSurname, newMidName, numb, mail, tg);
        }
    }

    public int clientCount = 0;

    public void addClient(Client client) {
        clientCount++;
        clients.add(client);
        System.out.println("Клієнт " + client.getName() + (" ") + client.getSurname() + " був доданий до колекції. \nКлієнтів в базі: " + clientCount);
    }

    public void deleteClients(Client client) {
        clientCount--;
        clients.remove(client);
        System.out.println("Клієнт " + client.getName() + (" ") + client.getSurname() + " був видалений з колекції. \nКлієнтів в базі: " + clientCount);
    }

    public void infoClient(Client client){
        System.out.println("Name: " + client.getName() + "\nSurname: " + client.getSurname() + ("\nMidname: " + client.getMidName() + ("\nNumber: " + client.getNumber() + ("\nProduct: "))));
    }

    public void count() {
        System.out.println("Всього людей в базі: " + clientCount);
    }


    public void ClientList(ArrayList<Client> clients) {
        for (Client client : clients) {
            System.out.println("Имя: " + client.getName());
            System.out.println("Фамилия: " + client.getSurname());
        }
    }
    public static Manager manager = new Manager("Ivan", "Burlachenko", "Sergiyovich", "0687946379", "", "");

}
