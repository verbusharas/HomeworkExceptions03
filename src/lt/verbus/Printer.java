package lt.verbus;

public class Printer extends Device{
    private String deviceDescription;
    public Printer() {
        super();
        deviceDescription = "Printer";
    }

    @Override
    public String getDeviceDescription() {
        return deviceDescription;
    }
}
