package task2_2.model.entities;

public class Circle extends Shape {
    private double r;

    public Circle(String shapeColor, double r) {
        super(shapeColor);
        this.r = r;
    }

    @Override
    public double calcArea() {
        return Math.PI*r*r;
    }


    @Override
    public String toString() {
        return super.toString() +
                "r = " + r +
                '}';
    }
}
