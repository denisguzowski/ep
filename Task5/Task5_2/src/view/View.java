package view;

import java.util.Collection;

public class View {
    public void printMessage(String s) {
        System.out.println(s);
    }

    public void printCollection(Collection coll) {
        System.out.println(coll.toString());
    }
}
