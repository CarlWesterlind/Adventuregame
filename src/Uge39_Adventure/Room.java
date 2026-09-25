package Uge39_Adventure;

public class Room {
    private String name;
    private String description;
    private Room north;
    private Room east;
    private Room south;
    private Room west;
    private boolean visited = false;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public void setNorth(Room north) {

        this.north = north;
    }

    public void setEast(Room east) {

        this.east = east;
    }

    public void setSouth(Room south) {

        this.south = south;
    }

    public void setWest(Room west) {

        this.west = west;
    }

    public String getName() {

        return name;
    }

    public String getDescription() {
        return description;
    }

    public Room getEast() {
        return east;
    }

    public Room getNorth() {
        return north;
    }

    public Room getSouth() {
        return south;
    }

    public Room getWest() {
        return west;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean isVisited(){
        return visited;
    }

}
//