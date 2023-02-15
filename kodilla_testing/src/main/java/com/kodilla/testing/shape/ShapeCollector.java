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

    public List<Shape> showFigures(){
       /* String figuresName = "";
        for (int i=0 ; i<shapeList.size(); i++){
            figuresName += shapeList.get(i).getShapeName();
        }*/
        return shapeList;
    }

    public List<Shape> getShapeList() {
        return shapeList;
    }
}
