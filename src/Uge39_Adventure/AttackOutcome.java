package Uge39_Adventure;

public class AttackOutcome {


    private final AttackResult result;
    private final String itemName;
    private final String userLeftText;

    public AttackOutcome(AttackResult result, String itemName, String userLeftText) {
        this.result = result;
        this.itemName = itemName;
        this.userLeftText = userLeftText;
    }

    public AttackResult getResult() {
        return result;
    }

    public String getItemName() {
        return itemName;
    }

    public String getUserLeftText(){
        return userLeftText;
    }

}





