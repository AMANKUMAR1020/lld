package CreationalDesignPattern.FactoryDesignPattern.Problem;

public class Bus implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver by bus");
    }
}