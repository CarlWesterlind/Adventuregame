package Uge39_Adventure;

public class Adventure {
    private Player player;

    public void startGame(){
        Room startRoom = GameMap.buildMap();
        player = new Player(startRoom);
    }
    public boolean go(String direction){
        return player.move(direction);
    }
    public String look(){
        Room room = player.getCurrentRoom();
        return "You are in " + room.getName() + "\n" + room.getDescription();
    }



}
