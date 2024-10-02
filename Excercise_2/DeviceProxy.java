
public class DeviceProxy {
    private SmartDevice device;

    public DeviceProxy(SmartDevice device) {
        this.device = device;
    }

    public void turnOn() {
        System.out.println("Accessing device: " + device.getId());
        device.turnOn();
    }

    public void turnOff() {
        System.out.println("Accessing device: " + device.getId());
        device.turnOff();
    }
}
