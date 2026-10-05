package Uge39_Adventure;

public class RangedWeapon extends Weapon{
    private int ammunition;

    public RangedWeapon(String shortName, String longName, int damage, int ammunition){
        super(shortName, longName, damage);
        this.ammunition = ammunition;
    }

    @Override
    public boolean canUse(){
        return ammunition > 0;
    }
    @Override
    public void use(){
        ammunition--;
    }
    @Override
    public String getAttackVerb(){
        return "Pow!";
    }
    @Override
    public String getUserLeftText(){
        return "Shots left:" + ammunition;
    }
}
