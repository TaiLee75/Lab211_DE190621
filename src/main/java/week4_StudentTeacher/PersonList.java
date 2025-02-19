package week4_StudentTeacher;

import java.util.ArrayList;

public class PersonList {

    ArrayList<Person> persons = new ArrayList<>();

    public void addPerson(Person emp) {
        persons.add(emp);
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

   public Person findByName(String name) {
        for (Person temp : persons) {
            if (name.equalsIgnoreCase(temp.getFullName())) {
                return temp;
            }
        }
        return null;
    }
    

    
    
    
}
