package Uge39_Adventure;

public class Item {
    private String shortName;
    private String longName;
    private boolean isWeapon;

    public Item(String shortName, String longName, boolean isWeapon){
        this.shortName = shortName;
        this.longName = longName;
        this.isWeapon = isWeapon;
    }
    public String getShortName() {
        return shortName;
    }

    public String getLongName() {
        return longName;

    }
    public boolean isWeapon(){
        return isWeapon;
    }
    public boolean isFood(){
        return false;
    }

}