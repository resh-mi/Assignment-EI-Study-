
public abstract class SmartDevice {
    private int id;
    private String type;

    public SmartDevice(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public abstract void turnOn();
    public abstract void turnOff();

    @Override
    public String toString() {
        return "SmartDevice{" +
                "id=" + id +
                ", type='" + type + ''' +
                '}';
    }
}
