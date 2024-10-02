
public class Light extends SmartDevice {
    public Light(int id) {
        super(id, "Light");
    }

    @Override
    public void turnOn() {
        System.out.println("Light " + getId() + " is turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Light " + getId() + " is turned OFF.");
    }
}
