package Task1;

public class Car
{

    String make;
    String model;
    int year;
    String bodyStyle;
    Driver driver;

    //constructor
    public Car(String make, String model, int year, String bodyStyle)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;
    }


    //getter
    public Driver getDriver()
    {
        return this.driver;
    }


    //setter
    public void setDriver(Driver driver)
    {
        this.driver = driver;
    }

    // override the toString method in the Car class



    /* nedenstående toString metode kan også være sådan her:
    public String toString()
    {
     return "Make: "+make+". Model: "+model+ " ("+ year + "), BodyStyle: "+bodyStyle+", Driver: "+driver;
    }
    */
    @Override
    public String toString()
    {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", bodyStyle='" + bodyStyle + '\'' +
                ", driver=" + driver +
                '}';
    }


}
