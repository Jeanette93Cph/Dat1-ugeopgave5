package Task1;

public class Driver
{
    String name;
    int age;


    //constructor
    public Driver(String name, int age)
    {
        this.name = name;

        this.age = age;
    }


    // override the toString method in the Driver class
    public String toString()
    {
        return "is driven by "+name;
    }




}
