package task2_2.model.entities;

public abstract class Shape implements Drawable {
    private String shapeColor;

    Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public abstract double calcArea();

    @Override
    public String draw() {
        return this.toString() + " area = " + String.valueOf(calcArea());
    }

    @Override
    public String toString() {
        return  this.getClass().getSimpleName()+ "{" +
                "shapeColor = " + shapeColor +
                ", ";
    }
}
