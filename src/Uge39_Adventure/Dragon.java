package Uge39_Adventure;

public class Dragon extends Enemy{

    public Dragon(Room room){
        super("dragon", "a terrifying dragon",
                "A terrifying dragon towers before you, guarding the end of your journey.",
                150, new MeleeWeapon("fang", "a giant dragon fang", true, 30), room);
    }
}
