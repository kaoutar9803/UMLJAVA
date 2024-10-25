package org.example;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John Doe", "123 Main St, City", "john.doe@example.com");
        customer1.displayCustomerInfo();

        Customer customer2 = new Customer();
        customer2.setName("Jane Smith");
        customer2.setAddress("456 Elm St, Town");
        customer2.setEmail("jane.smith@example.com");
        customer2.displayCustomerInfo();
        Book book1 = new Book("1984", "George Orwell", 328);
        book1.displayBookInfo();

        System.out.println();

        Plane plane1 = new Plane("Boeing 747", "747", 1968);
        plane1.displayPlaneInfo();

        University university = new University("UM6P");

        Student student1 = new Student(1, "Kaoutar Kouache");
        Student student2 = new Student(2, "YAS Kouache");
        Student student3 = new Student(3, "Charlie Brown");

        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);

        university.displayUniversityInfo();


        Player player = new Player("Alice", "123 Player Lane");
        Bot bot = new Bot("Bot1", "456 Bot Avenue");

        player.displayInfo();
        player.save();
        player.load("123 Player Lane");
        player.delete();

        System.out.println();

        bot.displayInfo();
        bot.save();
        bot.load("456 Bot Avenue");
        bot.delete();

    }
}