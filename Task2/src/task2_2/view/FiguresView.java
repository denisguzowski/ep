package task2_2.view;

import task2_2.model.entities.Shape;

public class FiguresView {

    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please ";

    public static final String MENU  = "Menu: \n"
            + "Enter 0 to Get a full list of figures; \n"
            + "Enter 1 to Get a total area of figures; \n"
            + "Enter 2 to Get a total area of a given type; \n"
            + "Enter 3 to Sort figures by area; \n"
            + "Enter 4 to Sort figures by color; \n"
            + "Enter 5 to Finish the program; ";

    public static final String SUBMENU = "Submenu: \n"
            + "Enter a type of figure: \n"
            + "1 Circle; \n"
            + "2 Triangle; \n"
            + "3 Rectangle; \n";

    public static final String RESULT = "Result: ";
    public static final String ALL_FIGURES = "All figures: ";
    public static final String GOODBYE = "Goodbye ";
    //public static final String NOTHING_FOUND = "Nothing found ";


    public void printMessage(String message){
        System.out.println(message);
    }

    public void printFigures(Shape[] shapes){
        for (Shape s:shapes) {
            System.out.println(s.draw());
        }
        System.out.println();
    }
}
