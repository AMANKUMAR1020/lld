package CreationalDesignPattern.FactoryDesignPattern.Solution;

public class TransportService {

    public void TransportService(){
        System.out.println("This is TransportService Constructor");
    }

    public void execute() {

        Transport vehicle = TransportFactory.createTransport("car");
        vehicle.deliver();
    }
}