package structureDesignPattern.FlyWeightPattern.Solution;

public class Game {

    public Game(){
        System.out.println("This is Game Constructor");
    }

    public void execute() {
        System.out.println(BulletType.count);
        // 5 Red Bullet Objects
        for(int i=0;i<5;i++){
            Bullet bullet = new Bullet("Red",i*10,i*12,5);
        }
        System.out.println(BulletType.count);
        // 5 Green Bullet Objects
        for(int i=0;i<5;i++){
            Bullet bullet = new Bullet("Red",i*10,i*12,5);
        }
        System.out.println(BulletType.count);
    }
}

