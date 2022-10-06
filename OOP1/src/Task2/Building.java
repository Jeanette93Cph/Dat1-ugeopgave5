package Task2;

import java.util.ArrayList;

public class Building
{

    public final ArrayList<Room> rooms;


    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;


    //constructor
    public Building(ArrayList<Room>rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding)
    {
        this.rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }


    //getter
    public ArrayList<Room> getRooms()
    {
        return rooms;
    }

    public int NumberOfBathrooms()
    {
        return numberOfBathrooms;
    }

    public int NumberOfFloors()
    {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding()
    {
        return isOfficeBuilding;
    }



}
