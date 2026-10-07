package Uge39_Adventure;

import java.util.Scanner;

import static Uge39_Adventure.AttackResult.*;

public class UserInterface {
    static void User(Adventure adventure) {
        adventure.startGame();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        System.out.print("Welcome to Adventure!\n");
        System.out.print("Type 'help' for commands\n");
        System.out.print(adventure.look());

        while (running) {
            System.out.print("\n > ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.startsWith("take ")) {
                String itemName = input.substring(5);

                if (adventure.take(itemName)) {
                    System.out.println("You picked up the " + itemName + ".");
                } else {
                    System.out.println("There is no " + itemName + " here.");
                }
                continue;
            }

            if (input.startsWith("drop ")) {
                String itemName = input.substring(5);

                if (adventure.drop(itemName)) {
                    System.out.println("You dropped the " + itemName + ".");
                } else {
                    System.out.println("You don't have a " + itemName + ".");
                }
                continue;
            }

            if (input.startsWith("eat ")) {
                String foodName = input.substring(4);
                EatOutcome outcome = adventure.eat(foodName);

                switch (outcome.getResult()) {
                    case NOT_FOUND:
                        System.out.println("You don't have " + foodName + "to eat.");
                        continue;
                    case NOT_FOOD:
                        System.out.println("You can't eat a " + outcome.getItemName() + ".");
                        continue;
                    case EATEN:
                        System.out.println("You ate the " + outcome.getItemName() + "Health: " + outcome.getHealthChange());
                        continue;
                }

            }
            if (input.startsWith("equip ")) {
                String weaponName = input.substring(6);
                EquipOutcome outcome = adventure.equip(weaponName);
                switch (outcome.getResult()) {
                    case NOT_FOUND:
                        System.out.println("You don't have " + weaponName + " to equip");
                        continue;
                    case NOT_WEAPON:
                        System.out.println("You can't equip that: " + outcome.getItemName());
                        continue;
                    case EQUIPPED:
                        System.out.println("You have equipped: " + weaponName);
                        continue;
                }
            }

            if(input.equals("attack")||input.startsWith("attack ")){
                String enemyName = "";
                if(input.equals("attack ")) {
                    enemyName = input.substring(7);
                }
                    AttackOutcome outcome = adventure.attack(enemyName);

                    switch(outcome.getResult()) {
                        case NOT_WEAPON_EQUIP:
                            System.out.println("You don't have a weapon equipped.");
                            break;
                        case OUT_OF_USES:
                            System.out.println("Your " + outcome.getWeaponName() + " can't be used anymore");
                            break;
                        case NO_SUCH_ENEMY:
                            System.out.println("There is no " + enemyName + " here.");
                            break;
                        case HIT_AIR:
                            System.out.println("You " + outcome.getAttackVerb() + " " + outcome.getWeaponName() +
                                    " at the empty air. " + outcome.getUsesLeftText());
                            break;
                        case ENEMY_DIED:
                            System.out.println("You hit " + outcome.getEnemyName() + " for " + outcome.getDamageDealt() + " damage.");
                            System.out.println(outcome.getEnemyName() + " dies. It dropped " + outcome.getDroppedWeaponName() + ".");
                            break;
                        case ENEMY_COULD_NOT_HIT:
                            System.out.println("You hit " + outcome.getEnemyName() + " for " + outcome.getDamageDealt() + " damage.");
                            System.out.println(outcome.getEnemyName() + " tries to strike back, but can't");
                            break;
                        case ENEMY_HIT_BACK:
                            System.out.println("You hit " + outcome.getEnemyName() + " for " + outcome.getDamageDealt() + " damage.");
                            System.out.println(outcome.getEnemyName() + " hits you for " + outcome.getDamageTaken() + " damage");
                            break;
                        case PLAYER_DIED:
                            System.out.println("You hit " + outcome.getEnemyName() + " for " + outcome.getDamageDealt() + " damage.");
                            System.out.println(outcome.getEnemyName() + " hits you for " + outcome.getDamageTaken() + " damage");
                            System.out.println("GAME OVER!!! You have died");
                            running = false;
                            break;
                    }
                    continue;
                }

                    switch (input) {
                case "go north", "north", "n":
                    if (adventure.go("north")) {
                        System.out.print("Going north\n");
                        System.out.println(adventure.look());
                    } else {
                        System.out.println("You can't go that way");
                    }
                    break;

                case "go west", "west", "w":
                    if (adventure.go("west")) {
                        System.out.print("Going west\n");
                        System.out.println(adventure.look());
                    } else {
                        System.out.println("You can't go that way");
                    }
                    break;

                case "go south", "south", "s":
                    if (adventure.go("south")) {
                        System.out.print("Going south\n");
                        System.out.println(adventure.look());
                    } else {
                        System.out.println("You can't go that way");
                    }
                    break;

                case "go east", "east", "e":
                    if (adventure.go("east")) {
                        System.out.print("Going east\n");
                        System.out.println(adventure.look());
                    } else {
                        System.out.println("You can't go that way");
                    }
                    break;
                case "look":
                    System.out.print(adventure.look());
                    break;

                case "inventory", "i":
                    System.out.println(adventure.inventory());
                    break;

                case "help":
                    System.out.print("Commands: \n - go north (n, north) \n - go west (w, west) \n - go east (e, east) \n - go south (s, south) \n - inventory (i) \n - take\n - drop\n - look\n - attack\n - health (hp)\n - exit");
                    break;

                case "health", "hp":
                    int health = adventure.getHealth();
                    String reminder;
                    if (health >= 100) {
                        reminder = "You are in perfect health";
                    } else if (health >= 50) {
                        reminder = "You are in good health. But try find something to eat!";

                    } else if (health >= 25) {
                        reminder = "You are wounded";

                    } else if (health >= 1) {
                        reminder = "You are barely alive";
                    } else {
                        reminder = "You are so low on health!, Don't fight";
                    }
                    System.out.print("Health: " + health + " - " + reminder);
                    break;

                case "exit":
                    System.out.print("You have exit the game!");
                    running = false;
                    break;


                default:
                    System.out.println("Unknown command. Try 'help' for commandlist");
                    break;

            }

        }
        scanner.close();


    }
}
