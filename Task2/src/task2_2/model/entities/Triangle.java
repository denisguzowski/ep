package task2_2.model.entities;

public class Triangle extends Shape {
    private double a, h;

    public Triangle(String shapeColor, double a, double h) {
        super(shapeColor);
        this.a = a;
        this.h = h;
    }

    @Override
    public double calcArea() {
        return a*h/2;
    }

    @Override
    public String toString() {
        return super.toString() +
                "a = " + a +
                ", h = " + h +
                '}';
    }
}
