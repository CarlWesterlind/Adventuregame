package Uge39_Adventure;
import java.util.Random;
    //Enemy repræsenterer en fjende i spillet med navn, beskrivelse, liv og et våben.
public class Enemy {

    private String shortName;
    private String longName;
    private String description;
    private int health;
    private Weapon weapon;
    private Room room;
    private Random random = new Random();


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

    /*
       Trækker skade fra fjendens liv. Hvis liv når 0 eller derunder, dropper fjenden
       sit våben i rummet og fjernes fra rummet. Returnerer true hvis fjenden døde,
       ellers false.
    */
    public boolean hit(int damage) {
        health -= damage;
        if(health <= 0) {
            room.addItem(weapon);
            room.removeEnemy(this);
            return true;
        }
        return false;
    }
    /*
    Fjenden forsøger at angribe spilleren med sit eget våben. Hvis våbnet ikke
    kan bruges (f.eks. løbet tør for ammunition), returneres 0 for at vise, at
    fjenden ikke kunne ramme. Ellers bruges våbnet, og den skade det gør
    returneres og trækkes fra spillerens liv.
    og att det fins en 10% chanse for at enemy miss attack.
    OBS: Lige nu har ingen fjende en RangedWeapon.
     */
    public int attack(Player player){
        if(!weapon.canUse()){
            return 0;
        }
        weapon.use();
        if(random.nextInt(100) < 10){
            return 0;
        }
        int damage = weapon.getDamage();
        player.hit(damage);
        return damage;
    }

}
