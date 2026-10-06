package Uge39_Adventure;

public class Enemy {

    String shortName;
    String longName;
    int enemyHealth;
    int enemyDamage;
    boolean isAlive = true;


    public Enemy(String shortName, String longName, int enemyHealth, int enemyDamage){
        this.shortName = shortName;
        this.longName = longName;
        this.enemyHealth = enemyHealth;
        this.enemyDamage = enemyDamage;
    }

    public String getShortName(){
        return shortName;
    }

    public String getLongName() { return longName; }

    public int getEnemyHealth(){
        return enemyHealth;
    }

    public int getEnemyDamage(){
        return enemyDamage;
    }

    public void EnemyTakeDamage(int damage) {
        enemyHealth -= damage;
    }

    public void isAlive(){
        if(enemyHealth <= 0){
            isAlive = false;
        }
        else{
        }
    }

}
