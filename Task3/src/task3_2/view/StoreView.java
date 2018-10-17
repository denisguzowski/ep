package task3_2.view;

public class StoreView {
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please ";

    public static final String MENU  = "Menu: \n"
            + "Enter 0 to Get a full list of departments and products; \n"
            + "Enter 1 to Add department; \n"
            + "Enter 2 to Remove department; \n"
            + "Enter 3 to Sort departments by name; \n"
            + "Enter 4 to Add product to department; \n"
            + "Enter 5 to Remove product from department; \n"
            + "Enter 6 to Finish the program; ";

    public static final String DEPT_NAME = "Enter a department name";
    public static final String PROD_NAME = "Enter a product name";

    //sub
    public static final String GOODS = "Enter a type of goods";
    public static final String SERVICES = "Enter description of services";
    public static final String LOCATION = "Enter a location";
    public static final String AMOUNT = "Enter an amount";
    public static final String PRICE = "Enter a price";

    //public static final String RESULT = "Result: ";
    public static final String ALL = "All: ";
    public static final String GOODBYE = "Goodbye ";
    //public static final String NOTHING_FOUND = "Nothing found ";


    public void printMessage(String message){
        System.out.println(message);
    }

}
