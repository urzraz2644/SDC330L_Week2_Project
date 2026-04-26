/*
Name: Urzalla Razmowar
Assignments: Week 3 Project 
Date: 04-26-2026
Purpose: This class represents a business contact with a company name.
*/

public class BusinessContact extends Contact {
    
    private String company;

    public BusinessContact(String name, String phone, String company) {
        super(name, phone);
        this.company = company;
    }

    public BusinessContact() {
        super("Unknown", "000-000-0000");
        this.company = "Unknown";
    }

    @Override
    public void display() {
        System.out.println("Name: " + name + " | Phone: " + phone + " | Company: " + company);
        
    }
}