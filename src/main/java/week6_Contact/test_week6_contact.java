/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6_Contact;

/**
 *
 * @author ADMIN
 */
public class test_week6_contact {
    public static void main(String[] args) {
        
    
    ContactListView contact = new ContactListView();
    
    String[] options = {
            "Add a Contact",
            "Display all Contact",
            "Delete a Contact",
            "Exit"
        };
        
        
       Menu menu = new Menu("========= Contact program =========", options) {
            @Override
            public void execute(int n) {
                switch (n) {
                    case 1:
                      contact.addContact();
                        break;
                    case 2:
                       contact.printContact();
                        break;
                    case 3:
                        contact.deleteContact();
                        break;
                    
                    case 4:
                        System.exit(0);
                }
            }

        };

        menu.run();
        
    
    
    
    
    }
}
