package CreationalDesignPattern.BuilderDesignPattern.Problem;

public class WithoutBuilderPattern {
    public WithoutBuilderPattern(){
        System.out.println("This is WithoutBuilderPattern Constructor");
    }
    public void execute() {
        House house = new House("Concrete","Wood","Shingles",true,true,false);
        //House house2 = new House("Concrete","Wood","Shingles");
        // Constructor Explosion -> Too Many Constructors
        // Difficult to understand and maintain this code
        // this is where builder pattern comes into picture
        System.out.println(house);
    }
}