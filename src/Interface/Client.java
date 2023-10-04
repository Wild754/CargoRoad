package Interface;
import Interface.*;
import Interface.Client.*;
import java.util.function.Predicate;
import static Interface.Client.*;
import static Interface.Storage.*;
import static Interface.Route.*;
import static Interface.Car.*;
import static Interface.Supplier.*;
import static Interface.Order.*;
import static Interface.Manager.*;
import static Interface.Product.*;



public class Client {
    private String name;
    private String surname;
    private String midName;
    private String number;
    private String mail;
    private String tg;

    public Client(String newName, String newSurname, String newMidName, String numb, String mail, String tg) {
        this.name = newName;
        this.surname = newSurname;
        this.midName = newMidName;
        this.number = numb;
        this.mail = mail;
        this.tg = tg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getMidName() {
        return midName;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    public void setTg(String tg) {
        this.tg = tg;
    }

    public String getTg() {
        return tg;
    }
    public int clientCount = 0;

   public static Client client = new Client("Andrew", "Baklan", "Olekandrovich", "0990804632", "andrejbaklan25@gmail.com", "@backlandly");
   public static Client client2 = new Client("Bob", "Clock", "Olekandrovich", "0990804632", "andrejbaklan25@gmail.com", "@backlandly");
   public static Client client3 = new Client("Flok", "frog", "Olekandrovich", "0990804632", "andrejbaklan25@gmail.com", "@backlandly");
}
