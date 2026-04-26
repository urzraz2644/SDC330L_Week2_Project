/*
Name: Urzalla Razmowar
Assignments: SDC330 WEEK 2 
Date: 04-25-2026
*/

public class Contact implements DisplayInterface {
    
    protected String name;
    protected String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public void display() {
        System.out.println("Name: " + name + " | Phone: " + phone);
    }
}