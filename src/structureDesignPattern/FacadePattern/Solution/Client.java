package structureDesignPattern.FacadePattern.Solution;

public class Client {
    public Client(){
        System.out.println("This is Client Constructor");
    }

    public void execute(){
        // Client code interacting with API Gateway (Facade)
        APIGateway apiGateway = new APIGateway();
        //Task
        System.out.println(apiGateway.getFullOrderDetails("123","456","789"));
    }
}