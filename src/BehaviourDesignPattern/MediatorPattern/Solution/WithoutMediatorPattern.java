package BehaviourDesignPattern.MediatorPattern.Solution;

//Chat System
class User{
    private String name;

    public User(String name){
        this.name = name;
    }

    public void sendMessage(String msg, User recipient){
        System.out.println(this.name + " sending "+ msg + " to " + recipient.getName());
    }

    public String getName(){
        return name;
    }
}


public class WithoutMediatorPattern {

    public WithoutMediatorPattern(){
        System.out.println("This is WithMediatorPattern Constructor");
    }

    public void execute() {
        User rahul = new User("Rahul");
        User amit = new User("Amit");
        User neha = new User("Neha");

        rahul.sendMessage("Hello",amit);
        rahul.sendMessage("Hello",neha);

    }
}