/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6_Contact;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class ContactList {

    ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(Contact emp) {
        contacts.add(emp);

    }

    public ArrayList<Contact> getAllContacts() {
        return contacts;
    }

    public Contact findByID(int id) {
        for (Contact emp : contacts) {
            if (id == emp.getId()) {
                return emp;
            }
        }

        return null;
    }

    
    public void deleteContact(Contact emp){
        contacts.remove(emp);
    }
    
    
    public void changeIdAfterDelete(int id){
        for(int i = id - 1; i < contacts.size(); i++){
            contacts.get(i).setId(i+1); 
        }
}
    }
