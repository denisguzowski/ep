package util;

import java.util.Locale;

public enum Language {
    ENG(new Locale("en", "US")),
    RUS(new Locale("ru", "RU")),
    UKR(new Locale("uk", "UA"));
    private Locale locale;

    Language(Locale locale) {
        this.locale = locale;
    }

    public Locale getLocale() {
        return locale;
    }
}
