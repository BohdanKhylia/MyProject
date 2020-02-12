package sanbox;

/*
* Receive List of Person objects
* Apply filters for choosing certain Person objects
* Return filtered objects
* Return certain fields of the object*/

import java.util.List;
import java.util.function.Predicate;

public class ChoosePerson {

    public void checkPersons(List<Person> list, Predicate<Person> tester){
        for (Person p:list){
            if (tester.test(p)){
                p.printPerson();
            }
        }
    }
}
