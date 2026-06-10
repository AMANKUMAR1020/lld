//import structureDesignPattern.AdapterPattern.Client;
//import structureDesignPattern.DecoratorPattern.Solution.PizzaApp;
//import structureDesignPattern.ProxyPattern.Solution.Client;
//import structureDesignPattern.CompositePattern.Solution.FileSystemApp;
import CreationalDesignPattern.FactoryDesignPattern.Solution.TransportService;
import CreationalDesignPattern.SingletonPattern.Problem.WithoutSingletonPattern;
import CreationalDesignPattern.SingletonPattern.Solution.SingletonPattern;
import structureDesignPattern.FacadePattern.Solution.Client;
import structureDesignPattern.FlyWeightPattern.Solution.Game;

public static void main(String[] args) {
//    Client client = new Client();
//    client.execute();

//    PizzaApp pizza = new PizzaApp();
//    pizza.execute();

//    Client client = new Client();
//    client.execute();

//      FileSystemApp file = new FileSystemApp();
//      FileSystemApp.execute();

//    Client client = new Client();
//    client.execute();

//    Game game = new Game();
//    game.execute();

//    WithoutSingletonPattern withoutSingletonPattern = new WithoutSingletonPattern();
//    withoutSingletonPattern.execute();

//    SingletonPattern singletonPattern = new SingletonPattern();
//    singletonPattern.execute();

    TransportService transportService = new TransportService();
    transportService.execute();

}
