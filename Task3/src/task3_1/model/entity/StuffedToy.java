package task3_1.model.entity;

public class StuffedToy extends Toy{
    private int size;

    public StuffedToy(String name, double price, int age, int size) {
        super(name, price, age);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", size = " + size +
                '}';
    }
}
