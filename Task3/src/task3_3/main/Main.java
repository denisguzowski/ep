package task3_3.main;

import task3_3.enums.Month;
import task3_3.enums.my_enum.MEnum;

public class Main {
    public static void main(String[] args){

        System.out.println("Java enum");
        Month m = Month.JANUARY;
        System.out.println("Name = " + m.name());
        System.out.println("Ordinal = " + m.ordinal());
        System.out.println("toString = " + m.toString());
        System.out.println("DeclaringClass = " + m.getDeclaringClass());
        System.out.println("Class = " + m.getClass());
        System.out.println("hashCode = " + m.hashCode());

        Month[] months = Month.values();

        for (int i = 0; i < months.length; i++) {
            System.out.println("name = " + months[i].name() + ", ordinal = " + months[i].ordinal() + ", month number = " + months[i].getMonthNumber());
        }
        System.out.println("---------------------------------");


        System.out.println("My enum");
        MEnum me = new MEnum("JANUARY",0);
        System.out.println("Name = " + me.name());
        System.out.println("Ordinal = " + me.ordinal());
        System.out.println("toString = " + me.toString());
        System.out.println("DeclaringClass = " + me.getDeclaringClass());
        System.out.println("Class = " + me.getClass());
        System.out.println("hashCode = " + me.hashCode());

        MEnum[] meArr = MEnum.values();
        for (int i = 0; i < meArr.length; i++) {
            System.out.println("name = " + meArr[i].name() + ", ordinal = " + meArr[i].ordinal()  + ", month number = " + meArr[i].getMonthNumber());
        }

        MEnum example = MEnum.valueOf("JANUARY");
        System.out.println("Name = " + example.name());
        System.out.println("Ordinal = " + example.ordinal());

        System.out.println(example.compareTo(me));
        System.out.println(example.equals(example));
    }

}
