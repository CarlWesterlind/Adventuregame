package Uge39_Adventure;

public class Room {
    private String name;
    private String description;
    private Room north;
    private Room east;
    private Room south;
    private Room west;

    public Room(String name, String description){
        this.name = name;
        this.description = description;
    }

    public void setNorth(Room room) {
        this.north = room;
    }

    public void setEast(Room room) {
        this.east = room;
    }

    public void setSouth(Room room) {
        this.south = room;
    }

    public void setWest(Room room) {
        this.west = room;
    }

    public Room getEast() {
        return east;
    }

    public Room getNorth() {
        return north;
    }
    public Room getSouth(){
        return south;
    }

    public Room getWest() {
        return west;
    }
}
