package Uge39_Adventure;
import java.util.ArrayList;
public class Room {
    private String name;
    private String description;
    private Room north;
    private Room east;
    private Room south;
    private Room west;
    private boolean visited = false;
    private ArrayList<Item> items;
    private ArrayList<Enemy> enemies;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        this.items = new ArrayList<>();
        this.enemies = new ArrayList<>();
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

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }

    public ArrayList<Item> getItems(){
        return items;
    }

    public ArrayList<Enemy> getEnemies() { return enemies; }

    public void addEnemy(Enemy enemy) { enemies.add(enemy); }

    public void removeEnemy(Enemy enemy) { enemies.remove(enemy); }

}
