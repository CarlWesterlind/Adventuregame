package Uge39_Adventure;
//Kvittering for et equip-forsøg: resultatet og navnet på det item, der blev forsøgt udstyret.
public class EquipOutcome {
    private final EquipResult result;
    private final String itemName;

    public EquipOutcome(EquipResult result, String itemName){
        this.result = result;
        this.itemName = itemName;
    }

    public EquipResult getResult() {
        return result;
    }

    public String getItemName() {
        return itemName;
    }
}
