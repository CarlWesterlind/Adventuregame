package Uge39_Adventure;

import java.util.Scanner;

public class UserInterface {
    static void User(Adventure adventure) {
        adventure.startGame();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        System.out.println("Welcome to Adventure!");
        System.out.print("Type 'help' for commands");

        while(running){
            System.out.print("\n > ");
            String input = scanner.nextLine().trim().toLowerCase();
            switch (input) {
                case "go north":
                case "north":
                case "n":
                    if(adventure.go("north")){
                        System.out.println("Going north");
                        System.out.println(adventure.look());
                    }else {
                        System.out.println("You can't go that way");
                    }
                    break;

                case "go west":
                case "west":
                case "w":
                    if(adventure.go("west")){
                        System.out.println("Going west");
                        System.out.println(adventure.look());
                    }else {
                        System.out.println("You can't go that way");
                    }
                    break;

                case "go south":
                case "south":
                case "s":
                    if(adventure.go("south")){
                        System.out.println("Going south");
                        System.out.println(adventure.look());
                    }else {
                        System.out.println("You can't go that way");
                    }
                    break;

                case "go east":
                case "east":
                case "e":
                    if(adventure.go("east")){
                        System.out.println("Going east");
                        System.out.println(adventure.look());
                    }else {
                        System.out.println("You can't go that way");
                    }
                    break;
                case "look":
                    System.out.println(adventure.look());
                    break;

                case "help":
                    System.out.println("Commands: \n go north (n, north) \n go west (w, west) \n go east (e, east) \n go south (s, south) \n look\n exit");
                    break;

                case "exit":
                    System.out.println("You have exit the game!");
                    running = false;
                break;

            }

        }
        scanner.close();

    }
}
