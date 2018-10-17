package task3_1.model.entity;

public class Constructor extends Toy{
    private int numberOfDetails;

    public Constructor(String name, double price, int age, int numberOfDetails) {
        super(name, price, age);
        this.numberOfDetails = numberOfDetails;
    }

    public int getNumberOfDetails() {
        return numberOfDetails;
    }

    public void setNumberOfDetails(int numberOfDetails) {
        this.numberOfDetails = numberOfDetails;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", numberOfDetails = " + numberOfDetails +
                '}';
    }
}
