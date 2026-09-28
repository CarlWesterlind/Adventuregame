package Uge39_Adventure;

public class Items {
    private String shortName;
    private String longName;

    public Items (String shortName, String longName){
        this.shortName = shortName;
        this.longName = longName;
    }
    Items stone = new Items("stone", "a shiny stone");
    Items key = new Items("key", "old rusty key");
    Items lamp = new Items("lamp", "a shiny brass lamp");

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public String getLongName() {
        return longName;

    }
    public void setStone(Items stone) {
        this.stone = stone;
    }

    public Items getStone() {
        return stone;
    }

    public void setKey(Items key) {
        this.key = key;
    }

    public Items getKey() {
        return key;
    }

    public void setLamp(Items lamp) {
        this.lamp = lamp;
    }

    public Items getLamp() {
        return lamp;
    }

}
