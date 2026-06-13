package CreationalDesignPattern.BuilderDesignPattern.Solution;

public class WithBuilderPattern {

    public WithBuilderPattern(){
        System.out.println("This is WithBuilderPattern Constructor");
    }

    public void execute() {
        House house = new House.HouseBuilder("Concrete", "Wooden", "Tile")
                .setGarden(true)
                .setSwimmingPool(true)
                .setGarage(false)
                .build();

        System.out.println(house);
    }
}