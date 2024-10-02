
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SmartHomeHub hub = SmartHomeHub.getInstance();
        Scheduler scheduler = new Scheduler();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option: 1. Add Device 2. Turn On Device 3. Turn Off Device 4. Set Schedule 5. Show Devices 6. Show Schedules 7. Exit");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter device id and type (light/thermostat/door): ");
                    int id = scanner.nextInt();
                    String type = scanner.next();
                    SmartDevice device = DeviceFactory.createDevice(id, type);
                    hub.addDevice(device);
                    break;
                case 2:
                    System.out.print("Enter device id to turn on: ");
                    int deviceIdToTurnOn = scanner.nextInt();
                    new DeviceProxy(hub.getDevice(deviceIdToTurnOn)).turnOn();
                    break;
                case 3:
                    System.out.print("Enter device id to turn off: ");
                    int deviceIdToTurnOff = scanner.nextInt();
                    new DeviceProxy(hub.getDevice(deviceIdToTurnOff)).turnOff();
                    break;
                case 4:
                    System.out.print("Enter device id, time, and action (on/off): ");
                    int deviceId = scanner.nextInt();
                    String time = scanner.next();
                    String action = scanner.next();
                    scheduler.setSchedule(deviceId, time, action);
                    break;
                case 5:
                    hub.showDevices();
                    break;
                case 6:
                    scheduler.showSchedules();
                    break;
                case 7:
                    System.out.println("Exiting Smart Home System.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
