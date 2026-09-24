package Uge39_Adventure;

public class Map {

    public static Room buildMap() {

            Room room1 = new Room("Room 1", "An empty room");
            Room room2 = new Room("Room 2", "A bright room");
            Room room3 = new Room("Room 3", "A dark room");
            Room room4 = new Room("Room 4", "A room that smells bad");
            Room room5 = new Room("Room 5", "A room that full of trees");
            Room room6 = new Room("Room 6", "A very dark room");
            Room room7 = new Room("Room 7", "A room full of very bright colours");
            Room room8 = new Room("Room 8", "A fun room");
            Room room9 = new Room("Room 9", "A terrible room");

            room1.setEast(room2);
            room1.setSouth(room4);

            room2.setEast(room3);
            room2.setWest(room1);

            room3.setSouth(room6);
            room3.setWest(room2);

            room4.setNorth(room1);
            room4.setSouth(room7);

            room5.setSouth(room8);

            room6.setNorth(room3);
            room6.setSouth(room9);

            room7.setNorth(room4);
            room7.setEast(room8);

            room8.setNorth(room5);
            room8.setWest(room7);
            room8.setEast(room9);

            room9.setWest(room7);
            room9.setNorth(room6);


            return room1;
        }


    }



