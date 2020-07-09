package lt.verbus;

public class DeviceIsOffException extends Exception {
    private String errorMessage;

    public DeviceIsOffException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
