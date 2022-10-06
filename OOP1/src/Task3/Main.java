package Task3;

import java.util.ArrayList;


public class Main
{

    public static ArrayList<Customer> customers = new ArrayList();

    public static void main(String[] args)
    {
        Customer customer1 = new Customer("Maja", "Jensen", "MJ");
        Customer customer2 = new Customer("Elsa", "Jørgensen", "EJ");
        Customer customer3 = new Customer("Jeanette", "Gøttsche", "JG");
        Customer customer4 = new Customer("Signe", "Olsen", "SO");
        Customer customer5 = new Customer("Sidsel", "Mogensen", "SM");
        Customer customer6 = new Customer("Tobias", "Sørensen", "TS");

        ArrayList<Customer> customers = new ArrayList();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        customers.add(customer6);

        printCustomers(customers);

    }


    //for each loop
    public static void printCustomers(ArrayList<Customer> customers)
    {
        for (Customer allCustomers: customers)
        {
            System.out.println(allCustomers);
        }  
    }    
        


}
