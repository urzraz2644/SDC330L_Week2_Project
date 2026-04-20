# Name: Urzalla Razmowar
# Date: 04-19-2026
# Assignment: Contact Manager demonstrating inheritance, interface, and polymorphism

print("Week 2 Project - Software Design")
print("Name: Urzalla Razmowar")
print("Welcome! Use the menu to add or view contacts.\n")

# Interface
class DisplayInterface:
    def display(self):
        pass

# Parent class
class Contact(DisplayInterface):
    def __init__(self, name, phone):
        self.name = name
        self.phone = phone

    # Polymorphism: display() works differently depending on object type
    def display(self):
        print(f"Name: {self.name} | Phone: {self.phone}")

# Child class (Inheritance)
class BusinessContact (Contact):
    def __init__(self, name, phone, company):
        super().__init__(name, phone)
        self.company = company

    def display(self):
        print(f"Name: {self.name} | Phone: {self.phone} | Company: {self.company}")

# Composition class
class ContactManager:
    def __init__(self):
        self.contacts = []

    def add_contact(self, contact):
        self.contacts.append(contact)

    def show_contacts(self):
        if not self.contacts:
            print("No contacts found.")
        else:
            for contact in self.contacts:
                contact.display()   # Polymorphism happens here

# Main program
manager = ContactManager()

while True:
    print("\nMenu:")
    print("1. Add Regular Contact")
    print("2. Add Business Contact")
    print("3. View Contacts")
    print("4. Exit")

    choice = input("Choose an option: ")

    if choice == "1":
        name = input("Enter name: ")
        phone = input("Enter phone: ")
        contact = Contact(name, phone)
        manager.add_contact(contact)
        print("Contact added successfully!")

    elif choice == "2":
        name = input("Enter name: ")
        phone = input("Enter phone: ")
        company = input("Enter company: ")
        contact = BusinessContact(name, phone, company)
        manager.add_contact(contact)
        print("Business contact added sucessfully!")

    elif choice == "3":
        manager.show_contacts()

    elif choice == "4":
        print("Goodbye!")
        break
   
    else:
        print("Invalid option. Try again.")