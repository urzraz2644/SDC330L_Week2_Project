/*
Name: Urzalla Razmowar
Assignments: SDC330 WEEK 2 
Date: 04-25-2026
*/

import java.util.ArrayList;

public class ContactManager {
    private ArrayList<DisplayInterface> contacts;

    public ContactManager() {
        contacts = new ArrayList<>();
    }
    
    public void addContact(DisplayInterface contact) {
        contacts.add(contact);
    }

    public void displayContacts() {
        for (DisplayInterface c : contacts) {
            c.display();
        }
    }
}
