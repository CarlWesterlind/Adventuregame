package Uge39_Adventure;

public class Food extends Item{
    private int healthPoints;

    public Food(String shortName, String longName, boolean isWeapon, int healthPoints){
        super(shortName, longName, isWeapon);
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints(){
        return healthPoints;
    }
    @Override
    public boolean isFood(){
        return true;
    }
}
