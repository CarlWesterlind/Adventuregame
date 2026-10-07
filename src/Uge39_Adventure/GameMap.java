package Uge39_Adventure;

public class GameMap {

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

            Item lamp = new Item("lamp", "A trusty 'lamp', worn from many journeys. Its warm glow lights the path ahead.", false);
            Item key = new Item("key", "An old 'key' with strange markings. Who knows what it might unlock?", false);
            Item gold = new Item("gold", "A handful of gleaming 'gold' coins. Useful for trade, or just admiring",false);
            Food mushroomSoup = new Food("soup","A creamy 'soup' made from freshly foraged mushrooms. Warms you from the inside out",false,15);
            Food wildMushroom = new Food("mushroom", "A wild 'mushroom' found deep in the woods. Looks just like the ones in your soup",false ,-25);
            Weapon maze = new MeleeWeapon("maze", "A iron 'maze'",true,20);
            Weapon rifle = new RangedWeapon("mosin", "an old reliebel 'mosin'",true , 45, 5);

            Enemy goblin = new Goblin(room4);
            room4.addEnemy(goblin);
            Enemy dragon = new Dragon(room5);
            room5.addEnemy(dragon);



            room9.addItem(lamp);
            room4.addItem(key);
            room2.addItem(mushroomSoup);
            room5.addItem(gold);
            room3.addItem(wildMushroom);
            room4.addItem(maze);
            room9.addItem(rifle);

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

            room9.setWest(room8);
            room9.setNorth(room6);


            return room1;
        }


    }



