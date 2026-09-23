package Uge39_Adventure;

import java.util.Scanner;

public class UserInterface {
    static void User(Main main) {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        System.out.println("Welcome to Adventure!");
        System.out.print("Type 'help' for commands");

        while(running){
            System.out.print("\n > ");
            String input = scanner.nextLine().toLowerCase();
            switch (input) {
                case "go north":
                case "north":
                    System.out.println("Going north");
                    break;

                case "go west":
                case "west":
                    System.out.println("Going west");
                    break;

                case "go south":
                case "south":
                    System.out.println("Going south");
                    break;

                case "go east":
                case "east":
                    System.out.println("Going east");
                    break;
                case "look":
                    System.out.println("Looking around the room");
                    break;

                case "help":
                    System.out.println("Commands \n go north \n go west\n go east \n go south \n look\n exit");
                    break;

                case "exit":
                    System.out.println("You have exit the game!");
                default:

            }
            scanner.close();


        }

    }
}
