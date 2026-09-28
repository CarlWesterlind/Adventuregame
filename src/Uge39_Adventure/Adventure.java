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
        return "You are in " + room.getName() + "\n" + room.getDescription();
    } // vurdere være variablen skal hedde(itemName er en placeholder)

    public boolean take(String itemName) {
        return player.takeItem(itemName);

    }      // vurdere være variablen skal hedde

    public boolean drop(String itemName) {
        return player.dropItem(itemName);
    }
}