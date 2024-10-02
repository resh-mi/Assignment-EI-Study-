
import java.util.HashMap;
import java.util.Map;

public class Scheduler {
    private Map<Integer, String> schedules;

    public Scheduler() {
        schedules = new HashMap<>();
    }

    public void setSchedule(int deviceId, String time, String action) {
        schedules.put(deviceId, time + " - " + action);
        System.out.println("Schedule set for device " + deviceId + " at " + time + " to " + action);
    }

    public void showSchedules() {
        schedules.forEach((deviceId, schedule) ->
            System.out.println("Device " + deviceId + ": " + schedule));
    }
}
