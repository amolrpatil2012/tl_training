package demo.loosecoupling;

import demo.loosecoupling.beans.Bike;
import demo.loosecoupling.beans.Car;
import demo.loosecoupling.beans.LooselyCoupledCustomer;
import demo.loosecoupling.beans.TightlyCoupledCustomer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car car = new Car();
        Bike bike = new Bike();
        
        TightlyCoupledCustomer cust = new TightlyCoupledCustomer();
        cust.setName("Suresh");
        cust.setCar(car);		// cust.setCar(bike) -- error --- tightly coupled
        
        System.out.println(" Name of Customer : " + cust.getName());
        System.out.println(" Total Rent : " + cust.getTotalRent(10));
        
        LooselyCoupledCustomer lc = new LooselyCoupledCustomer();
        lc.setName("Ramesh");
        lc.setVehicle(bike);		// lc.setVehicle(car)  -- loosely coupled
        
        
        
    }
}
