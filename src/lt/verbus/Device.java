package lt.verbus;

import java.util.UUID;

public class Device {
    boolean isOn;
    String id;

    public Device() {
        isOn = false;
        id = UUID.randomUUID().toString();
    }

}
