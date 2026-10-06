package Uge39_Adventure;

public class Enemy {

    String name;
    int enemyHealth;
    int enemyDamage;
    boolean isAlive = true;


    public Enemy(String name, int enemyHealth, int enemyDamage){
        this.name = name;
        this.enemyHealth = enemyHealth;
        this.enemyDamage = enemyDamage;
    }

    public String getName(){
        return name;
    }

    public int getEnemyHealth(){
        return enemyHealth;
    }

    public int getEnemyDamage(){
        return enemyDamage;
    }

    public void EnemyTakeDamage(){

    }

    public void isAlive(){
        if(enemyHealth <= 0){
            isAlive = false;
        }
        else{
        }
    }

}
