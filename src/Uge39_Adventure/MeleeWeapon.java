package Uge39_Adventure;

public class MeleeWeapon extends Weapon {
    public MeleeWeapon(String shortName, String longName, boolean isWeapon, int damage){
        super(shortName, longName, isWeapon, damage);
    }
    @Override
    public boolean canUse(){
        return true;
    }
    @Override
    public void use(){

    }
    @Override
    public String getAttackVerb() {
        return "Swing!";
    }
    @Override
    public String getUserLeftText(){
        return "";
    }
}
