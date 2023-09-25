package Interface;

public class Supplier {
    private String name;
    private String surname;
    private String midName;
    private String numb1; // склад з яким працює постачальник
    private String numb2; // віділення в яке поїде товар
    private String phonenumb;
    public Supplier(String newName,String newSurname,String newMidName, String newNumb1, String newNumb2, String phone){
    this.name = newName;
    this.surname = newSurname;
    this.midName = newMidName;
    this.numb1 = newNumb1;
    this.numb2 = newNumb2;
    this.phonenumb = phone;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }
    public String getMidName() {
        return midName;
    }
    public void setMidName(String midName) {
        this.midName = midName;
    }
    public void setNumb1(String numb1) {
        this.numb1 = numb1;
    }
    public String getNumb1() {
        return numb1;
    }
    public void setNumb2(String numb2) {
        this.numb2 = numb2;
    }
    public String getNumb2() {
        return numb2;
    }

    public void setPhonenumb(String phonenumb) {
        this.phonenumb = phonenumb;
    }

    public String getPhonenumb() {
        return phonenumb;
    }
}
