package Uge39_Adventure;

public abstract class Weapon extends Item {
    private int damage;

    public Weapon(String shortName, String longName, boolean isWeapon, int damage){
        super(shortName, longName,isWeapon);
        this.damage = damage;
    }
    @Override
    public boolean isWeapon(){
        return true;
    }

    public int getDamage(){
        return damage;
    }
    public abstract boolean canUse();

    public abstract void use();

    public abstract String getAttackVerb();

    public abstract  String getUserLeftText();

}
