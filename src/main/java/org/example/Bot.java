package org.example;

public class Bot extends Person implements Saveable {

    public Bot(String name, String address) {
        super(name, address);
    }

    @Override
    public void save() {
        System.out.println("Saving bot data...");
    }

    @Override
    public void delete() {
        System.out.println("Deleting bot data...");
    }

    @Override
    public void load(String address) {
        System.out.println("Loading bot data from " + address + "...");
    }

    public void displayInfo() {
        System.out.println("Bot Name: " + name);
        System.out.println("Bot Address: " + address);
    }
}
