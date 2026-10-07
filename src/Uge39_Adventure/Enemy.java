package Uge39_Adventure;

public class Enemy {

    private String shortName;
    private String longName;
    private String description;
    private int health;
    private Weapon weapon;
    private Room room;


    public Enemy(String shortName, String longName, String description, int health, Weapon weapon, Room room){
        this.shortName = shortName;
        this.longName = longName;
        this.description = description;
        this.health = health;
        this.weapon = weapon;
        this.room = room;
    }

    public String getShortName(){
        return shortName;
    }

    public String getLongName() {
        return longName;
    }

    public String getDescription(){
        return description;
    }

    public int getHealth(){
        return health;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public boolean hit(int damage) {
        health -= damage;
        if(health <= 0) {
            room.addItem(weapon);
            room.removeEnemy(this);
            return true;
        }
        return false;
    }
    public int attack(Player player){
        if(!weapon.canUse()){
            return 0;
        }
        weapon.use();
        int damage = weapon.getDamage();
        player.hit(damage);
        return damage;
    }

}
