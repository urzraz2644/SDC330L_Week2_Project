/*
Name: Urzalla Razmowar
Assignments: Week 3 Project 
Date: 04-26-2026
Purpose: This class manages a collection of contacts by storing them
in a list, allowing contacts to be added, and displaying all contacts using polymorphism.
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
