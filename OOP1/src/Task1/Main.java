package Task1;

public class Main
{
    public static void main(String[] args)
    {
        Driver driver1 = new Driver("Carsten",40);

        Car car1 = new Car("Skoda", "Stationcar", 2021, "medium");
        Car car2 = new Car("Volvo", "SUV", 2019, "large");

        car1.setDriver(driver1);
        System.out.println(car1);

        car2.setDriver(driver1);
        System.out.println(car2);

    }


}
