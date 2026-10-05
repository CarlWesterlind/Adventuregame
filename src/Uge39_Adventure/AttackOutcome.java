package Uge39_Adventure;

public class AttackOutcome {


    private final AttackResult result;
    private final String itemName;
    private final String usesLeftText;
    private final String attackVerb;

    public AttackOutcome(AttackResult result, String itemName, String usesLeftText, String attackVerb) {
        this.result = result;
        this.itemName = itemName;
        this.usesLeftText = usesLeftText;
        this.attackVerb = attackVerb;
    }

    public AttackResult getResult() {
        return result;
    }

    public String getItemName() {
        return itemName;
    }

    public String getUsesLeftText(){
        return usesLeftText;
    }

    public String getAttackVerb(){
        return attackVerb;
    }

}
