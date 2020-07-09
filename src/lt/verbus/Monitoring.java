package lt.verbus;

import java.util.List;

public class Monitoring {
    public void pingAllDevices (List<Device> devices) {
        System.out.println("\n------ Pinging of devices started ------");
        for (Device device: devices) {
            try {
                device.ping();
                System.out.printf("%s %-15s %s %s %s",
                        "Device",
                        device.getDeviceDescription().toUpperCase(),
                        "with ID:", device.getId(),
                        "is ON.");
            } catch (DeviceIsOffException e) {
                System.out.println(e.getErrorMessage());
            }
        }
        System.out.println("------ Pinging of devices finished ------\n");
    }
}
