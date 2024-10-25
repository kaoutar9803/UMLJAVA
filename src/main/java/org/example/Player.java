package org.example;

public class Player extends Person implements Saveable {

    public Player(String name, String address) {
        super(name, address);
    }

    @Override
    public void save() {
        System.out.println("Saving player data...");
    }

    @Override
    public void delete() {
        System.out.println("Deleting player data...");
    }

    @Override
    public void load(String address) {
        System.out.println("Loading player data from " + address + "...");
    }

    public void displayInfo() {
        System.out.println("Player Name: " + name);
        System.out.println("Player Address: " + address);
    }
}
