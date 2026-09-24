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
                case "n":
                    Map.buildMap();
                    System.out.println("Going north");
                    break;

                case "go west":
                case "w":
                    Map.buildMap();
                    System.out.println("Going west");
                    break;

                case "go south":
                case "s":
                    Map.buildMap();
                    System.out.println("Going south");
                    break;

                case "go east":
                case "e":
                    Map.buildMap();
                    System.out.println("Going east");
                    break;
                case "look":
                    Map.buildMap();
                    System.out.println();
                    break;

                case "help":
                    System.out.println("Commands: \n go north \n go west\n go east \n go south \n look\n exit");
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
