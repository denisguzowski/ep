package util;

import java.util.Locale;
import java.util.ResourceBundle;

public enum ResourceManager {
    INSTANCE;

    private ResourceBundle resourceBundle;

    ResourceManager() {
        resourceBundle = ResourceBundle.getBundle("properties.message", Locale.getDefault());
    }

    public void changeLocale(Locale locale){
        resourceBundle = ResourceBundle.getBundle("properties.message", locale);
    }

    public String getMessage(String key){
        return resourceBundle.getString(key);
    }
}
