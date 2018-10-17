package task3_1.view;

import task3_1.model.entity.Toy;

public class ToysView {

    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please ";

    public static final String MENU  = "Menu: \n"
            + "Enter 0 to Get a full list of toys; \n"
            + "Enter 1 to Sort toys by name; \n"
            + "Enter 2 to Calculate total cost of toys; \n"
            + "Enter 3 to Get toys by price and age\n"
            + "Enter 4 to Finish the program; ";

    public static final String MIN_PRICE = "Enter a minimum price";
    public static final String MAX_PRICE = "Enter a maximum price";
    public static final String MIN_AGE = "Enter a minimum age";
    public static final String MAX_AGE = "Enter a maximum age";

    public static final String RESULT = "Result: ";
    public static final String ALL_TOYS = "All toys: ";
    public static final String GOODBYE = "Goodbye ";
    public static final String NOTHING_FOUND = "Nothing found ";


    public void printMessage(String message){
        System.out.println(message);
    }

    public <T extends Toy> void printToys(T[] toys){
        for (T t:toys) {
            System.out.println(t);
        }
    }
}
