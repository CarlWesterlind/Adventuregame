package Uge39_Adventure;
    // Goblin er en subklasse af Enemy og repræsenterer goblinen som fjende i spillet.
public class Goblin extends Enemy{
    // Sender goblinens faste værdier (navn, beskrivelse, liv, våben og skade)
    // videre til superklassen Enemy.

    public Goblin(Room room) {
        super("goblin","a filthy goblin","A filthy goblin is lurking in the corner.",40, new MeleeWeapon("maze", "a shiny iron maze", true, 7), room);
    }




}
