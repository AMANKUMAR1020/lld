package structureDesignPattern.DecoratorPattern.Solution;

public class PizzaApp {

    public PizzaApp(){
        System.out.println("This is PizzaApp construtor");
    }

    public void execute(){
        //Basic Pizza
        Pizza pizza = new BasicPizza();
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());

        //Add Cheese
        pizza = new CheeseDecorator(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());

        pizza = new OliveDecorator(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());

        pizza = new MushroomDecorator(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}
