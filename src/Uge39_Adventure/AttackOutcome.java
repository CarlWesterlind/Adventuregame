package Uge39_Adventure;
// Kvittering for et attack-forsøg: resultatet, våbnets navn, fjendens navn,
// hvor meget skade der blev givet og modtaget, og hvilket våben fjenden droppede, hvis den døde.

public class AttackOutcome {


    private final AttackResult result;
    private final String weaponName;
    private final String usesLeftText;
    private final String attackVerb;
    private final String enemyName;
    private final String droppedWeaponName;
    private final int damageDealt;
    private final int damageTaken;


    public AttackOutcome(AttackResult result, String weaponName, String usesLeftText, String attackVerb,
                         String enemyName, String droppedWeaponName, int damageDealt, int damageTaken){
        this.result = result;
        this.weaponName = weaponName;
        this.usesLeftText = usesLeftText;
        this.attackVerb = attackVerb;
        this.enemyName = enemyName;
        this.droppedWeaponName = droppedWeaponName;
        this.damageDealt = damageDealt;
        this.damageTaken = damageTaken;
    }

    public AttackResult getResult() {
        return result;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public String getUsesLeftText() {
        return usesLeftText;
    }

    public String getAttackVerb() {
        return attackVerb;
    }

    public String getEnemyName() {
        return enemyName;
    }

    public String getDroppedWeaponName() {
        return droppedWeaponName;
    }

    public int getDamageDealt() {
        return damageDealt;
    }

    public int getDamageTaken() {
        return damageTaken;
    }
}
