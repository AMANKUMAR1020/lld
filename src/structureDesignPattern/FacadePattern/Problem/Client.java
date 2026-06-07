package structureDesignPattern.FacadePattern.Problem;

public class Client {
    public Client(){
        System.out.println("This is Client Constructor");
    }

    public void execute(){
        // Client code interacting with different services directly
        UserService userService = new UserService();
        OrderService orderService = new OrderService();
        PaymentService paymentService = new PaymentService();

        //Task
        System.out.println(userService.getUserDetails("123"));
        System.out.println(orderService.getOrderDetails("456"));
        System.out.println(paymentService.processPayment("789"));
    }
}
