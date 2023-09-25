package Interface;

public class Manager {
    private String name;
    private String surname;
    private String midName;
    private String number;

    public Manager (String newName, String newSurname, String newMidName, String numb) {
        this.name = newName;
        this.surname = newSurname;
        this.midName = newMidName;
        this.number = numb;
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
    public String getSurname(){
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
}

