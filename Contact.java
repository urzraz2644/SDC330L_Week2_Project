/*
Name: Urzalla Razmowar
Assignments: Week 3 Project 
Date: 04-26-2026
Purpose: This abstract class defines the common properties and
behavior for all contacts, such as name and phone, and requires
subclasses to implements the display methods.
*/

public abstract class Contact implements DisplayInterface {
    
    protected String name;
    protected String phone;

    // Constructor
    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    // Abstract method 
    public abstract void display(); 
}
