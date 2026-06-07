package structureDesignPattern.FlyWeightPattern.Solution;

//Flyweight Class
public class BulletType {
    private String color; //Intrinsic Property
    public static int count = 0;

    public BulletType(String color){
        this.color = color;
        System.out.println("Creating bulletType with color " + color);
        count++;
    }
}

