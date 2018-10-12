package task2_2.model.entities;

public class Rectangle extends Shape {
    private double a,b;

    public Rectangle(String shapeColor, double a, double b) {
        super(shapeColor);
        this.a = a;
        this.b = b;
    }

    @Override
    public double calcArea() {
        return a*b;
    }

    @Override
    public String toString() {
        return super.toString() +
                "a = " + a +
                ", b = " + b +
                '}';
    }
}
