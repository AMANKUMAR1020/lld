package BehaviourDesignPattern.ObserverPattern.Problem;

class DisplayDevice{
    public void showTemp(float temp){
        System.out.println("Current Temp: " + temp + " C");
    }
}

class WeatherStation{
    private float temperature;
    private DisplayDevice displayDevice; //can be multiple such devices later on

    public WeatherStation(DisplayDevice displayDevice){
        this.displayDevice = displayDevice;
    }

    public void setTemperature(float temp){
        this.temperature = temp;
        notifyDevice();
    }
    public void notifyDevice(){
        displayDevice.showTemp(temperature);
    }

}

public class WithoutObserverPattern {

    public WithoutObserverPattern(){
        System.out.println("This is WithoutObserverPattern Constructor");
    }

    public void execute() {
        DisplayDevice device = new DisplayDevice();
        WeatherStation station = new WeatherStation(device);
        //Tight Coupling B/w station and the device
        station.setTemperature(26);
        station.setTemperature(30);
    }
}