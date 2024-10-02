
import java.util.HashMap;
import java.util.Map;

public class SmartHomeHub {
    private static SmartHomeHub instance;
    private Map<Integer, SmartDevice> devices;

    private SmartHomeHub() {
        devices = new HashMap<>();
    }

    public static SmartHomeHub getInstance() {
        if (instance == null) {
            instance = new SmartHomeHub();
        }
        return instance;
    }

    public void addDevice(SmartDevice device) {
        devices.put(device.getId(), device);
        System.out.println("Device added: " + device);
    }

    public SmartDevice getDevice(int id) {
        return devices.get(id);
    }

    public void removeDevice(int id) {
        devices.remove(id);
        System.out.println("Device removed: " + id);
    }

    public void showDevices() {
        devices.values().forEach(System.out::println);
    }
}
