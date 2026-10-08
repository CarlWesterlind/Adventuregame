package Uge39_Adventure;
//Kvittering for et eat-forsøg: resultat, hvilket item og hvor meget liv der ændrede sig.
public class EatOutcome {

        private final EatResult result;
        private final String itemName;
        private final int healthChange;

        public EatOutcome(EatResult result, String itemName, int healthChange) {
            this.result = result;
            this.itemName = itemName;
            this.healthChange = healthChange;
        }

        public EatResult getResult() {
            return result;
        }

        public String getItemName() {
            return itemName;
        }

        public int getHealthChange() {
            return healthChange;
        }

    }





