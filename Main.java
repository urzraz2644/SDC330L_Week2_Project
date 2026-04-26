/*
Name: Urzalla Razmowar
Assignments: Week 3 Project 
Date: 04-26-2026
Purpose: This class runs the program and demonstrates how the contact
management system works by creating and displaying different types 
of contacts.
*/
public class Main {
    public static void main(String[] args) {
       
        System.out.println("Week 3 Project - Software Design");
        System.out.println("Name: Urzalla Razmowar");
        System.out.println("Welcome! This program manages contacts.\n");
       
        ContactManager manager = new ContactManager();

        Contact c1 = new PersonalContact("John Doe", "123-456-7890");
        Contact c2 = new BusinessContact("Jane Smith", "987-654-3210", "Amazon");

        manager.addContact(c1);
        manager.addContact(c2);

        System.out.println("Displaying Contacts:\n");
        manager.displayContacts();
    }
}    