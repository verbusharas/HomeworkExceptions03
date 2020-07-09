package lt.verbus;

import java.util.List;

public class Monitoring {
    public void pingAllDevices (List<Device> devices) {
        for (Device device: devices) {
            try {
                device.ping();
                System.out.println("The device is on.");
            } catch (DeviceIsOffException e) {
                System.out.println(e.getErrorMessage());
            }
        }
    }
}
