package lt.verbus;

import java.util.UUID;

public class Device {
    private boolean isOn;
    private String id;
    private String deviceDescription;

    public Device() {
        isOn = false;
        id = UUID.randomUUID().toString();
        deviceDescription = "Generic device";
    }

    public void turnOn(){
        isOn = true;
        System.out.printf("%s %s %s %s %s",
                "- Device",
                this.getDeviceDescription().toUpperCase(),
                "with ID:", this.getId(),
                "has been turned ON -\n");
    }

    public void ping() throws DeviceIsOffException {
        if (!isOn) throw new DeviceIsOffException(String.format("%s %-15s %s %s %s",
                "Device",
                this.getDeviceDescription().toUpperCase(),
                "with ID:",
                this.getId(),
                "is OFF."));
    }

    public String getId() {
        return id;
    }

    public String getDeviceDescription() {
        return deviceDescription;
    }
}
