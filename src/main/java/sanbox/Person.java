package sanbox;

import sun.util.resources.LocaleData;

public class Person {

    public enum Sex{
        MALE,FEMALE
    }
    public String email;
    public String name;
    public String address;
    public Sex gender;
    public LocaleData birthday;
    public boolean active;
    public int phoneNumber;

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                ", active=" + active +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public void printPerson(){
        System.out.println(this.toString());
    }
}
