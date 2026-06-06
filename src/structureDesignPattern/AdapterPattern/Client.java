//package structureDesignPattern.AdapterPattern;
//
//
//public class Client {
//    public Client(){
//        System.out.println("Constructor is created!");
//    }
//
//    String to = "customer@codingminutes.com";
//    String subject = "order confirmation";
//    String body = "your order has been received!";
//    NotificationService emailService = new EmailNotificationService();
//
//    emailService.send(to, subject, body);
//
//    //NotificationService sendGridEmailService = new SendGridService();
//    NotificationService emailServiceUsingSendGrid = new SendGridAdapter(new SendGridService());
//    emailServiceUsingSendGrid.send(to, subject, body);
//}


//package structureDesignPattern.AdapterPattern;
//
//public class Client {
//
//    public Client() {
//        System.out.println("Constructor is created!");
//
//        String to = "customer@codingminutes.com";
//        String subject = "Order Confirmation";
//        String body = "Your order has been received!";
//
//        NotificationService emailService = new EmailNotificationService();
//        emailService.send(to, subject, body);
//
//        NotificationService emailServiceUsingSendGrid =
//                new SendGridAdapter(new SendGridService());
//
//        emailServiceUsingSendGrid.send(to, subject, body);
//    }
//}



package structureDesignPattern.AdapterPattern;

public class Client {

    public Client() {}

    public void execute() {
        String to = "customer@codingminutes.com";
        String subject = "Order Confirmation";
        String body = "Your order has been received!";

        NotificationService emailService = new EmailNotificationService();
        emailService.send(to, subject, body);

        NotificationService emailServiceUsingSendGrid =
                new SendGridAdapter(new SendGridService());

        emailServiceUsingSendGrid.send(to, subject, body);
    }
}
