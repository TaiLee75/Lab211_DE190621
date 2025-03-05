/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6_Contact;

/**
 *
 * @author ADMIN
 */
public class ContactListView {

    ContactList contactList = new ContactList();

    public void addContact() {
        int id = contactList.getAllContacts().size() + 1;

        System.out.print("Enter name: ");
        String name = Validation.inputName();
        System.out.print("Enter group: ");
        String group = Validation.inputString();
        System.out.print("Enter address: ");
        String address = Validation.inputString();
        System.out.print("Enter phone: ");
        String phone = Validation.inputPhoneNumber();

        String[] tempName = name.trim().split("\\s+");
        String firstName = tempName[0];
        String lastName = tempName[1];
        Contact temp = new Contact(name, group, address, phone, firstName, lastName, id);
        contactList.addContact(temp);
        System.out.println("Contact added successfully!");

    }

    public void printContact() {
        if (contactList.getAllContacts().isEmpty()) {
            System.out.println("No contact in list!");
        } else {
            System.out.println("--------------------------------- Display all Contact ----------------------------");
            System.out.printf("%-5s  %-16s  %-10s  %-10s  %-10s  %-10s  %-10s\n", "id", "fullName", "firstName",
                    "lastName", "group", "address", "phone");

            for (Contact emp : contactList.getAllContacts()) {
                System.out.println(emp);
            }
        }

    }

    public void deleteContact() {
        Contact temp = null;
        System.out.print("Enter id of contact you want to find: ");
        int id = Validation.inputPositiveInt();
        temp = contactList.findByID(id);
        if (temp != null) {
            contactList.deleteContact(temp);
            contactList.changeIdAfterDelete(id);
            printContact();
        } else {
            System.out.println("Contact not found!");
        }

    }
}
