package lt.verbus;

public class MicrowaveOven extends Device{
    private String deviceDescription;
    public MicrowaveOven() {
        super();
        deviceDescription = "Microwave oven";
    }

    @Override
    public String getDeviceDescription() {
        return deviceDescription;
    }
}
