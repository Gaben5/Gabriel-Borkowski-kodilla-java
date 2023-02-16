package com.kodilla.testing.shape;

import java.util.LinkedList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapeList = new LinkedList<>();

    public void addFigure(Shape shape){
        shapeList.add(shape);
    }

    public void removeFigure(Shape shape){
        shapeList.remove(shape);
    }

    public Shape getFigure(int n){
        return shapeList.get(n);
    }

    public String showFigures() {
        String figures = "";
        for (int i = 0; i < shapeList.size(); i++) {
            if (i == shapeList.size() - 1) {
                figures += shapeList.get(i).getShapeName();
            } else {
                figures += shapeList.get(i).getShapeName() + ", ";
            }
        }
        return figures;
    }

    public List<Shape> getShapeList() {
        return shapeList;
    }
}
