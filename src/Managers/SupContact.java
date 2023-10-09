package Managers;
import Supplier.Supplier;
import Supplier.Supplier.*;

import static Supplier.Supplier.*;

public interface SupContact {
    public void sendMessage();
}
class Sms extends Supplier implements SupContact {
    public Sms(String newName, String newSurname, String newMidName, String numb, String mail, String tg, String newNumb1, String newNumb2) {
        super(newName, newSurname, newMidName, numb, mail, tg, newNumb1, newNumb2);
    }

    @Override
    public void sendMessage() {
        System.out.println("Номер " + supplier.getNumber());
    }
}
class tg implements SupContact {

    @Override
    public void sendMessage() {
        System.out.println("Тг " + supplier.getNumber());
    }
}
class email implements SupContact{

    @Override
    public void sendMessage() {
        System.out.println("Імейл " + supplier.getMail());
    }
}