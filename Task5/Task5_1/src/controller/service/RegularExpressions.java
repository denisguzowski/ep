package controller.service;

public interface RegularExpressions {
    String SURNAME = "[A-Z][a-z]*(-[A-Z][a-z]*)?";
    String NAME = "[A-Z][a-z]*";
    String DATE_OF_BIRTH = "((0[1-9])|([12]\\d)|(3[01]))\\.((0[1-9])|(1[12]))\\.[12]\\d{3}";
    String PHONE_NUMBER = "[1-9]\\d{0,2}\\d{9}";
    String STREET = "[A-Z][a-z]*(\\s[A-Z]?[a-z]*)*";
    String HOUSE = "[1-9]\\d{0,2}((/[1-9]\\d{0,2})?|[A-Z]?)";
    String APARTMENT = "[1-9]\\d{0,2}";
}
