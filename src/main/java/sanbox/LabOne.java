package sanbox;

import java.util.ArrayList;
import java.util.List;

public class LabOne {

    public static void main(String[] args) {
        ChoosePerson person = new ChoosePerson();
        List<Person> list = new ArrayList<>();
        person.checkPersons(list,
                person1 -> person1.gender == Person.Sex.MALE
                && person1.address.equals("Some"));
    }
}
