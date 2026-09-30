package Uge39_Adventure;

import java.util.ArrayList;


public class Player {
    private Room currentRoom;
    private ArrayList<Item> inventory;
    private int health;

    public Player(Room stratRoom) {
        this.currentRoom = stratRoom;
        this.inventory = new ArrayList<>();
        this.health = 75;
    }

    public boolean move(String direction) {
        Room desiredRoom = switch (direction) {
            case "go north", "north", "n" -> currentRoom.getNorth();
            case "go west", "west", "w" -> currentRoom.getWest();
            case "go east", "east", "e" -> currentRoom.getEast();
            case "go south", "south", "s" -> currentRoom.getSouth();
            default -> null;
        };
        if (desiredRoom != null) {
            currentRoom = desiredRoom;
            if (currentRoom.isVisited()) {
                System.out.println("You have been here before.");
            } else {
                System.out.println("This is a new room");
                currentRoom.setVisited(true);
            }
            return true;
        } else {
            return false;
        }
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    private Item findItem(String name, ArrayList<Item> list) {
        for (Item item : list) {
            if (item.getShortName().equals(name)) {
                return item;
            }
        }
        return null;

    }

    public boolean takeItem(String name) {
        Item item = findItem(name, currentRoom.getItems());
        if (item == null) {
            return false;
        }
        currentRoom.removeItem(item);
        inventory.add(item);
        return true;
    }

    public boolean dropItem(String name) {
        Item item = findItem(name, inventory);
        if (item == null) {
            return false;
        }
        inventory.remove(item);
        currentRoom.addItem(item);
        return true;
    }

    public String dInventory() {
        if (inventory.isEmpty()) {
            return ("Your inventory is empty");
        }
        String result = "You are Carrying:";

        for (Item item : inventory) {
            result += "\n\n- " + item.getLongName();
        }
        return result;
    }

    public Food eat(String shortName){
        Item item = findItem(shortName);
        if(item == null) {
            item = currentRoom.getItems(shortName);
        }
        if(item == null){
            return Food.NOT_FOUND;
        }
        if(!(item instanceof Food)){
            return Food.NOT_FOOD;
        }
        Food food = (Food) item;
        health += food.getHealthPoints();
        removeItems(food);
        return Food.EATEN;
    }
}