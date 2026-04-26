/*
Name: Urzalla Razmowar
Assignments: SDC330 WEEK 2 
Date: 04-25-2026
*/

public class Main {
    public static void main(String[] args) {
       
        System.out.println("Week 2 Project - Software Design");
        System.out.println("Name: Urzalla Razmowar");
        System.out.println("Welcome! This program manages contacts.\n");
       
        ContactManager manager = new ContactManager();

        Contact c1 = new Contact("John Doe", "123-456-7890");
        BusinessContact c2 = new BusinessContact("Jane Smith", "987-654-3210", "Amazon");

        manager.addContact(c1);
        manager.addContact(c2);

        System.out.println("Displaying Contacts:\n");
        manager.displayContacts();

    }
}    