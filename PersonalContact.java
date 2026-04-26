/*
Name: Urzalla Razmowar
Assignments: Week 3 Project 
Date: 04-26-2026
Purpose: This class represents a personal contact and extends the Contact class,
using the name and phone fields and providing its own display method.
*/

public class PersonalContact extends Contact {

    public PersonalContact(String name, String phone) {
        super(name, phone);
    }

    @Override
    public void display() {
        System.out.println("Name: " + name + " | Phone: " + phone);
    }
}
