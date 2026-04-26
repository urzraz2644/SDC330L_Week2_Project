/*
Name: Urzalla Razmowar
Assignments: SDC330 WEEK 2 
Date: 04-25-2026
*/

public class BusinessContact extends Contact {
    private String company;

    public BusinessContact(String name, String phone, String company) {
        super(name, phone);
        this.company = company;
    }

    @Override
    public void display() {
        System.out.println("Nmae: " + name + " | Phone: " + phone + " | Company: " + company);
        
    }
}