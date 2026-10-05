package Uge39_Adventure;

public class AttackOutcome {


    private final AttackResult result;
    private final String itemName;

    public AttackOutcome(AttackResult result, String itemName) {
        this.result = result;
        this.itemName = itemName;
    }

    public AttackResult getResult() {
        return result;
    }

    public String getItemName() {
        return itemName;
    }

}





