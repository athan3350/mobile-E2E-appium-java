package mobile.e2e.appium.utils;

import mobile.e2e.appium.exceptions.NotFoundItemException;

import java.util.Map;

public class CheckEnum {

    public void check(Map<String, String> itemsFromEnum, String itemToValidate ){
        if (!itemsFromEnum.containsValue(itemToValidate)){
            throw new NotFoundItemException(itemToValidate);
        }
    }
}
