
public class Thermostat extends SmartDevice {
    private int temperature;

    public Thermostat(int id) {
        super(id, "Thermostat");
        this.temperature = 70; // Default temperature
    }

    @Override
    public void turnOn() {
        System.out.println("Thermostat " + getId() + " is set to default temperature.");
    }

    @Override
    public void turnOff() {
        System.out.println("Thermostat " + getId() + " is turned OFF.");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Thermostat " + getId() + " temperature set to " + temperature);
    }

    public int getTemperature() {
        return temperature;
    }
}
