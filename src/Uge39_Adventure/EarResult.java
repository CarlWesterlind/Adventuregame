package Uge39_Adventure;

public class EatResult extends Item{
    private int healthPoints;

    public EarResult(String shortName, String longName, int healthPoints){
        super(shortName, longName);
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints(){
        return healthPoints;
    }
}
