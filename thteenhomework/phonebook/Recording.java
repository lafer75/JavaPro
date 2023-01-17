package thteenhomework.phonebook;

public class Recording {
    public String name;
    public String phone;

    public String getName() {
        return name;
    }



    public String getPhone() {
        return phone;
    }



    public Recording(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString(){
        return this.name + " : " + this.phone;
    }
}
