package Uge39_Adventure;

import java.util.Scanner;

public class UserInterface {
    static void User(Main main) {

        Room currenRoom = Map.buildMap();

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
                    if(currenRoom.getNorth()!=null){
                        currenRoom = currenRoom.getNorth();
                        System.out.println("Going north");
                    }else {
                        System.out.println("You can't go that way");
                    }
                    break;

                case "go west":
                case "west":
                case "w":
                    if(currenRoom.getWest()!=null){
                        currenRoom=currenRoom.getWest();
                        System.out.println("Going west");
                    }else {
                        System.out.println("You can't go that way");
                    }
                    break;

                case "go south":
                case "south":
                case "s":
                    if(currenRoom.getSouth()!=null){
                        currenRoom=currenRoom.getSouth();
                        System.out.println("Going south");
                    }else {
                        System.out.println("You can't go that way");
                    }
                    break;

                case "go east":
                case "east":
                case "e":
                    if(currenRoom.getEast()!=null){
                        currenRoom=currenRoom.getEast();
                        System.out.println("Going east");
                    }else {
                        System.out.println("You can't go that way");
                    }
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
