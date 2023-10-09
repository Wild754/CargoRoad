package Clients;

import Managers.Manager;


public class clientCount extends Manager {
    public clientCount(String newName, String newSurname, String newMidName, String numb, String mail, String tg) {
        super(newName, newSurname, newMidName, numb, mail, tg);
    }

    public static void count() {
        System.out.println("Всього людей в базі: " + clientCount);
    }
}
