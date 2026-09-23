package Uge39_Adventure;

public class Map {

    public static void buildMap()
        {

            Room room1 = new Room("Room 1", "An empty room");
            Room room2 = new Room("Room 2", "A bright room");
            Room room3 = new Room("Room 3", "A dark room");
            Room room4 = new Room("Room 4", "A room that smells bad");
            Room room5 = new Room("Room 5", "A room that full of trees");
            Room room6 = new Room("Room 6", "A very dark room");
            Room room7 = new Room("Room 7", "A room full of very bright colours");
            Room room8 = new Room("Room 8", "A fun room");
            Room room9 = new Room("Room 9", "A terrible room");

            room1.east = room2;
            room1.south = room4;

            room2.east = room3;
            room2.west = room1;

            room3.south = room6;
            room3.east = room2;

            room4.north = room1;
            room4.south = room7;

            room5.south = room8;

            room6.north = room3;
            room6.south = room9;

            room7.north = room7;
            room7.east = room8;

            room8.north = room5;
            room8.west = room7;
            room8.east = room9;

            room9.west = room7;
            room9.north = room6;



        }


    }



