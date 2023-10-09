package Storages;

import Storages.Storage;

import java.util.ArrayList;

public class StorageList extends Storage {
    public static ArrayList<Storage> storages = new ArrayList<>();

    public StorageList(String newStreet, String cord, String area, String product, String numb, String sch) {
        super(newStreet, cord, area, product, numb, sch);
    }

    public static void StorageList (ArrayList<Storage> storages) {
        storages.add(storage);
        storages.add(storage2);
        storages.add(storage3);
        storages.add(storage4);
        for (Storage storage : storages) {
            System.out.println("Доступний склад: \n" + "№ " + storage.getNumb() + (" ") + ("Вул. ") + storage.getStreet());
        }
    }
}
