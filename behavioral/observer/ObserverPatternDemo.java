
package behavioral.observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        PhoneDisplay phoneDisplay = new PhoneDisplay();

        station.addObserver(phoneDisplay);
        station.setTemperature(25);
        station.setTemperature(30);
    }
}
