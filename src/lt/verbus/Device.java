package lt.verbus;

import java.util.UUID;

public class Device {
    private boolean isOn;
    private String id;

    public Device() {
        isOn = false;
        id = UUID.randomUUID().toString();
    }

    public void turnOn(){
        isOn = true;
    }

    public void ping() throws DeviceIsOffException {
        if (!isOn) throw new DeviceIsOffException("The device is off.");
    }

}
