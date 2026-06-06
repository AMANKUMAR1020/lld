package structureDesignPattern.DecoratorPattern.Problem;

public class CheeseOlivePizza extends BasicPizza{
    @Override
    public String getDescription() {
        return super.getDescription() + ", Olives ";

    }

    @Override
    public double getCost() {
        return super.getCost() + 0.50;
    }
}
