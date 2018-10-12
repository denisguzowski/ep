package task2_2.model;

import task2_2.model.comparators.ShapeAreaComparator;
import task2_2.model.comparators.ShapeColorComparator;
import task2_2.model.entities.Circle;
import task2_2.model.entities.Rectangle;
import task2_2.model.entities.Shape;
import task2_2.model.entities.Triangle;

import java.util.Arrays;

public class Figures {
    private Shape[] figures;

    public Shape[] getFigures() {
        return figures;
    }

    public void setFigures(Shape[] figures) {
        this.figures = figures;
    }

    public double getTotalArea(){
        double sum = 0;

        for (int i = 0; i < figures.length; i++) {
            sum += figures[i].calcArea();
        }
        return sum;
    }


    public double getTotalAreaByGivenType(int number){
        double sum = 0;

        for (int i = 0; i < figures.length; i++) {
            switch (number){
                case 1: if(figures[i] instanceof Circle){
                            sum += figures[i].calcArea();
                        }
                        break;
                case 2: if(figures[i] instanceof Triangle){
                            sum += figures[i].calcArea();
                        }
                        break;
                case 3: if(figures[i] instanceof Rectangle){
                            sum += figures[i].calcArea();
                        }
                        break;
            }
        }

        return sum;
    }

    public Shape[] getFiguresSortedByArea(){
        Arrays.sort(figures, new ShapeAreaComparator());
        return figures;
    }

    public Shape[] getFiguresSortedByColor(){
        Arrays.sort(figures, new ShapeColorComparator());
        return figures;
    }

}
