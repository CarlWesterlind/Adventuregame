package Uge39_Adventure;
//Dragon er en subklasse af Enemy og repræsenterer dragen som fjende i spillet.
public class Dragon extends Enemy{
/*
Sender dragens faste værdier (navn, beskrivelse, liv, våben og skade)
videre til superklassen Enemy, som gemmer og håndterer dem.
 */
    public Dragon(Room room){
        super("dragon", "a terrifying dragon",
                "A terrifying dragon towers before you, guarding the end of your journey.",
                150, new MeleeWeapon("fang", "a giant dragon fang", true, 30), room);
    }
}
