package Uge39_Adventure;

import java.util.Scanner;

public class UserInterface {
    static void User(Adventure adventure) {
        adventure.startGame();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        System.out.print("Welcome to Adventure!\n");
        System.out.print("Type 'help' for commands\n");
        System.out.print(adventure.look());

        while(running){
            System.out.print("\n > ");
            String input = scanner.nextLine().trim().toLowerCase();
            switch (input) {
                case "go north", "north", "n":
                    if(adventure.go("north")){
                        System.out.print("Going north\n");
                        System.out.println(adventure.look());
                    }else {
                        System.out.println("You can't go that way");
                    }
                    break;

                case "go west", "west", "w":
                    if(adventure.go("west")){
                        System.out.print("Going west\n");
                        System.out.println(adventure.look());
                    }else {
                        System.out.println("You can't go that way");
                    }
                    break;

                case "go south", "south", "s":
                    if(adventure.go("south")){
                        System.out.print("Going south\n");
                        System.out.println(adventure.look());
                    }else {
                        System.out.println("You can't go that way");
                    }
                    break;

                case "go east", "east", "e":
                    if(adventure.go("east")){
                        System.out.print("Going east\n");
                        System.out.println(adventure.look());
                    }else {
                        System.out.println("You can't go that way");
                    }
                    break;
                case "look":
                    System.out.print(adventure.look());
                    break;

                case "help":
                    System.out.print("Commands: \n go north (n, north) \n go west (w, west) \n go east (e, east) \n go south (s, south) \n look\n exit");
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
