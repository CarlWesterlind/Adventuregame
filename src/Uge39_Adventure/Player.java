package Uge39_Adventure;

public class Player {
    private Room currentRoom;

    public Player(Room stratRoom){
        this.currentRoom = stratRoom;
    }

    public boolean move(String direction){
        Room desiredRoom = switch (direction){
            case "go north", "north", "n" ->currentRoom.getNorth();
            case "go west", "west", "w" ->currentRoom.getWest();
            case "go east","east","e" ->currentRoom.getEast();
            case "go south", "south","s" ->currentRoom.getSouth();
            default -> null;
        };
        if(desiredRoom !=null){
            currentRoom = desiredRoom;
            if(currentRoom.isVisited()){
                System.out.println("You have been here before.");
            } else {
                System.out.println("This is a new room");
                currentRoom.setVisited(true);
            }
            return true;
        }else {
            return false;
        }
    }
    public Room getCurrentRoom(){
        return currentRoom;
    }
    //
}
