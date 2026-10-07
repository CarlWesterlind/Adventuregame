package Uge39_Adventure;

public class Adventure {
    private Player player;

    public Adventure() {
    }

    public void startGame() {
        Room startRoom = GameMap.buildMap();
        player = new Player(startRoom);
        startRoom.setVisited(true);
    }

    public boolean go(String direction) {
        return player.move(direction);
    }

    public String look() {
        Room room = player.getCurrentRoom();
        String result = "You are in " + room.getName() + "\n" + room.getDescription();

        if (!room.getItems().isEmpty()){
            result += "\nItems:";

            for (Item item : room.getItems()){
                result += "\n- " + item.getLongName();
            }
        }
        if (!room.getEnemies().isEmpty()) {
            result += "\nBeware! Here lurks: ";

            for (Enemy enemy : room.getEnemies()) {
                result += "\n- " + enemy.getDescription();
            }
        }
        return result;
    }

    public boolean take(String itemName) {
        return player.takeItem(itemName);

    }

    public boolean drop(String itemName) {
        return player.dropItem(itemName);
    }

    public String inventory(){
        return player.dInventory();
    }
    public EatOutcome eat(String foodName) {
        return player.eat(foodName);
    }
    public int getHealth(){
        return player.getHealth();
    }
    public AttackOutcome attack(String enemyName){
        return player.attack(enemyName);
    }
    public EquipOutcome equip (String weaponName){
        return player.equip(weaponName);
    }





}