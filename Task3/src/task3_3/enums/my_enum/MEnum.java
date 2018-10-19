package task3_3.enums.my_enum;

public class MEnum extends MyEnum<MEnum>{
    private static MEnum[] me = {new MEnum("JANUARY", 0),
        new MEnum("FEBRUARY", 1)};

    public MEnum(String name, int ordinal) {
        super(name, ordinal);
    }

    //my method
    public int getMonthNumber(){
        return ordinal() + 1;
    }

    public static MEnum[] values(){
        return me;
    }

    public static MEnum valueOf(String name){
        for (MEnum e:me) {
            if(e.name().equals(name)){
                return e;
            }
        }
        throw new IllegalArgumentException();
    }
}
