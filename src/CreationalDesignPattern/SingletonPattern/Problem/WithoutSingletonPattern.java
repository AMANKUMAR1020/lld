package CreationalDesignPattern.SingletonPattern.Problem;

public class WithoutSingletonPattern {

    public WithoutSingletonPattern(){
        System.out.println("This is Constructor  WithoutSingletonPattern");
    }

    public void execute(){
        AppSettings appSettings = new AppSettings();
        AppSettings appSettingsCopy = new AppSettings();

        System.out.println(appSettingsCopy.getApiKey());
        System.out.println(appSettings.getApiKey());

        //More memory
        System.out.println(appSettings==appSettingsCopy);
    }
}