package Uge39_Adventure;

import java.util.ArrayList;


public class Player {
    private Room currentRoom;
    private ArrayList<Item> inventory;
    private int health;
    private Weapon equipped;

    public Player(Room stratRoom) {
        this.currentRoom = stratRoom;
        this.inventory = new ArrayList<>();
        this.health = 100;
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

    public int getHealth() {
        return health;
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

    public EatOutcome eat(String shortName) {
        EatResult result;
        String name = shortName;
        int healthChange = 0;

        Item item = findItem(shortName, inventory);
        boolean inInventory = item != null;
        if (item == null) {
            item = findItem(shortName, currentRoom.getItems());
        }

        if (item == null) {
            result = EatResult.NOT_FOUND;
        } else if (!(item instanceof Food)) {
            result = EatResult.NOT_FOOD;
            name = item.getLongName();
        } else {
            Food food = (Food) item;
            health += food.getHealthPoints();
            healthChange = food.getHealthPoints();
            name = food.getLongName();
            if (inInventory) {
                inventory.remove(food);
            } else {
                currentRoom.removeItem(food);
            }
            result = EatResult.EATEN;
        }

        EatOutcome outcome = new EatOutcome(result, name, healthChange);
        return outcome;
    }
    public AttackOutcome attack(){
        AttackResult result;
        String name = "";
        String usesLeftText = "";
        String attackVerb = "";

        if(equipped == null){
            result = AttackResult.NOT_WEAPON_EQUIP;
        } else if (!equipped.canUse()){
            result = AttackResult.OUT_OF_USES;
            name = equipped.getLongName();
        }else{
            name = equipped.getLongName();
            usesLeftText = equipped.getUserLeftText();
            attackVerb = equipped.getAttackVerb();
            equipped.use();
            result = AttackResult.ATTACKED;
        }
        AttackOutcome outcome = new AttackOutcome(result, name, usesLeftText, attackVerb);
        return outcome;


    }
    public EquipOutcome equip(String shortName){
        EquipResult result;
        Item item = findItem(shortName, inventory);
        String name = shortName;

        if(item == null) {
            result = EquipResult.NOT_FOUND;
        } else if (!item.isWeapon()) {
            result = EquipResult.NOT_WEAPON;
            name = item.getLongName();
        }else {
            equipped = (Weapon) item;
            name = item.getLongName();
            result = EquipResult.EQUIPPED;
        }
        return new EquipOutcome(result, name);
    }


}