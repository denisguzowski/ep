package task2_2.model.comparators;

import task2_2.model.entities.Shape;

import java.util.Comparator;

public class ShapeAreaComparator implements Comparator<Shape>{
    @Override
    public int compare(Shape o1, Shape o2) {
        return (int) (o1.calcArea() - o2.calcArea());
    }
}
