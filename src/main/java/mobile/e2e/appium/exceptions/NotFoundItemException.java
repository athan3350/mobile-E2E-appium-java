package mobile.e2e.appium.exceptions;

public class NotFoundItemException extends RuntimeException {
    public NotFoundItemException(String item) {
        super (String.format("The item %s not exist", item));
    }
}
