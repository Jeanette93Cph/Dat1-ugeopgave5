package Task2;

public class Room
{
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;


    //constructor
    public Room(int numberOfDoors, int numberOfLamps, int numberOfWindows)
    {
        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }



    //getter for the fields of the Room class
    public int getNumberOfDoors()
    {
        return numberOfDoors;
    }

    public int getNumberOfLamps()
    {
        return numberOfLamps;
    }

    public int getNumberOfWindows()
    {
        return numberOfWindows;
    }





}
