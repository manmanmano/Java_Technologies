package ee.taltech.theme2.part10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.String.format;

public class PersonGrouper {

    //todo 20.1 fix tests and add logic for these two methods
    public static Map<String, Person> mapPeopleByIdCode(List<Person> people) {

        HashMap<String, Person> personHashMap = new HashMap<>();
        for (Person person : people) {
            personHashMap.put(person.getIdCode(), person);
        }
        return personHashMap;
    }

    public static Map<String, Person> mapPeopleByFirstAndLastName(List<Person> people) {

        HashMap<String, Person> personHashMap = new HashMap<>();
        for (Person person : people) {
            personHashMap.put(format("%s %s", person.getFirstName(), person.getLastName()), person);
        }
        return personHashMap;
    }

    //todo 20.2 can you make this work as well?
    // ... is a varargs argument
    public static Map<String, Person> mapPeopleByIdCode(Person... people) {
        HashMap<String, Person> personHashMap = new HashMap<>();
        for (Person person : people) {
            personHashMap.put(person.getIdCode(), person);
        }
        return personHashMap;
    }

    //todo 20.3 this is quite hardcore, but what if you have people with the same name in your list of people
    // then you will have to return name and a list of people, create a test for it as well
    // try to do it without Streams, in the next lesson we will learn about the streams
    public static Map<String, List<Person>> groupPeopleByFirstAndLastNameMultiple(List<Person> people) {
        HashMap<String, List<Person>> personHashMap = new HashMap<>();
        for (Person person : people) {
            String fullname = getFullName(person);
            List<Person> personList = personHashMap.get(fullname);
            if (personList == null){
                personList = new ArrayList<>();
            }
            personHashMap.put(person.getIdCode(), personList);
        }
        return personHashMap;
    }

    private static String getFullName(Person person){
        return format("%s %s", person.getFirstName(), person.getLastName());
    }
}
