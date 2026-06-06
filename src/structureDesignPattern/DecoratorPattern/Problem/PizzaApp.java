package structureDesignPattern.DecoratorPattern.Problem;

public class PizzaApp {
    public PizzaApp(){
        System.out.println("This is PizzaApp Construtor\n");
    }

    public void execute(){
        Pizza pizza = new CheeseOlivePizza();
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());

        Pizza pizza1 = new CheesePizza();
        System.out.println(pizza1.getDescription());
        System.out.println(pizza1.getCost());

    }
}
