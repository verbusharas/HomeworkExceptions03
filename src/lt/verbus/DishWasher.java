package lt.verbus;

public class DishWasher extends Device{
    private String deviceDescription;
    public DishWasher() {
        super();
        deviceDescription = "Dish washer";
    }

    @Override
    public String getDeviceDescription() {
        return deviceDescription;
    }
}
