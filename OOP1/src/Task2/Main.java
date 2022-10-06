package Task2;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Room room1 = new Room(1, 3, 4);
        Room room2 = new Room(2, 2, 5);
        Room room3 = new Room(3, 4,6);

        ArrayList<Room>rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

       Building building1 = new Building(rooms, 6,7, false );

        //System.out.println(countLampsInBuilding(building1));

        System.out.println(isNormal(building1));

    }

    public static int countLampsInBuilding(Building building1)
    {
        ArrayList<Room>rooms = building1.getRooms();

        int total = 0;
        for (Room r:rooms)
        {
            int lamps = r.getNumberOfLamps();
            total += lamps;
        }
        return total;
    }

    public static boolean isNormal(Building building1)
    {
        int numberOfRooms = building1.rooms.size();
        int numberOfFloors = building1.NumberOfFloors();
        if (numberOfFloors > numberOfRooms)
        {
           return true;
        }
        System.out.println("This is an odd building");
        return false;
    }



}
