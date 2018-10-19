package task3_3.enums.my_enum;

import java.io.*;

abstract class MyEnum<E extends MyEnum<E>> implements Comparable<E>, Serializable {

    private final String name;

    public final String name() {
        return name;
    }

    private final int ordinal;

    public final int ordinal() {
        return ordinal;
    }

    protected MyEnum(String name, int ordinal) {
        this.name = name;
        this.ordinal = ordinal;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public final boolean equals(Object other) {
        return this==other;
    }

    @Override
    public final int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
       @Override
    public final int compareTo(E o) {
        MyEnum<?> other = (MyEnum<?>)o;
        MyEnum<E> self = this;
        if(self.getClass() != other.getClass() &&
                self.getDeclaringClass() != other.getDeclaringClass())
            throw new ClassCastException();
        return self.ordinal - other.ordinal;
    }

    public final Class<E> getDeclaringClass() {
        Class<?> clazz = getClass();
        Class<?> zuper = clazz.getSuperclass();
        return (zuper == MEnum.class) ? (Class<E>)clazz : (Class<E>)zuper;
    }

//    public static <T extends MEnum<T>> T valueOf(Class<T> enumType,
//                                                String name) {
//        T result = enumType.enumConstantDirectory().get(name);
//        if (result != null)
//            return result;
//        if (name == null)
//            throw new NullPointerException("Name is null");
//        throw new IllegalArgumentException(
//                "No enum constant " + enumType.getCanonicalName() + "." + name);
//    }


    @Override
    protected void finalize() { }

    /**
     * prevent default deserialization
     */
    private void readObject(ObjectInputStream in) throws IOException,
            ClassNotFoundException {
        throw new InvalidObjectException("can't deserialize enum");
    }

    private void readObjectNoData() throws ObjectStreamException {
        throw new InvalidObjectException("can't deserialize enum");
    }
}
