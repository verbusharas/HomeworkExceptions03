package lt.verbus;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Device> devices = Arrays.asList(new DishWasher(), new MicrowaveOven(), new Printer());
        Monitoring monitoring = new Monitoring();
        monitoring.pingAllDevices(devices);
        devices.get(2).turnOn();
        monitoring.pingAllDevices(devices);
    }
}
