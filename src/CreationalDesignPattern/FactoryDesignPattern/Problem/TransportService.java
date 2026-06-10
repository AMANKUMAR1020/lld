package CreationalDesignPattern.FactoryDesignPattern.Problem;

public class TransportService {

    public void TransportService(){
        System.out.println("This is TransportService Constructor");
    }

    public void execute() {

        //Direct create objects
        Transport car = new Car();
        Transport bike = new Bike();

        //add a bus object
        Transport bus = new Bus();
    }
}