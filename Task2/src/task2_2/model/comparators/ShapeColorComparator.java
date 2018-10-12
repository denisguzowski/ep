package task2_2.model.comparators;

import task2_2.model.entities.Shape;

import java.util.Comparator;

public class ShapeColorComparator implements Comparator<Shape>{
    @Override
    public int compare(Shape o1, Shape o2) {
        return o1.getShapeColor().compareTo(o2.getShapeColor());
    }
}
