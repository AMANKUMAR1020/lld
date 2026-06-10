package CreationalDesignPattern.SingletonPattern.Solution;

public class SingletonPattern {

    public SingletonPattern(){
        System.out.println("This is Constructor SingletonPattern");
    }

    public void execute() {
        AppSettings appSettings = AppSettings.getInstance(); //change this code
        AppSettings appSettingsCopy = AppSettings.getInstance();

        System.out.println(appSettingsCopy.getApiKey());
        System.out.println(appSettings.getApiKey());

        //More memory
        System.out.println(appSettings==appSettingsCopy);
    }
}