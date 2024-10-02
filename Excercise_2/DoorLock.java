
public class DoorLock extends SmartDevice {
    public DoorLock(int id) {
        super(id, "DoorLock");
    }

    @Override
    public void turnOn() {
        System.out.println("Door " + getId() + " is LOCKED.");
    }

    @Override
    public void turnOff() {
        System.out.println("Door " + getId() + " is UNLOCKED.");
    }
}
