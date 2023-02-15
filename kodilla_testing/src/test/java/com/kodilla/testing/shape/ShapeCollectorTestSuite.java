package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ShapeCollectorTestSuite {

    @Nested
    @DisplayName("Test add Figure")
    class TestAddFigures {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector sc = new ShapeCollector();
            Square sq1 = new Square("Square", 3.5);
            //When
            sc.addFigure(sq1);
            //Then
            Assertions.assertEquals(sc.getFigure(0), sq1);
        }
    }

    @Nested
    @DisplayName("Test remove figure")
    class TestRemoveFigures {
        @Test
        void testRemoveFigure() {
            //Given
            List<Shape> list = new ArrayList<>();
            ShapeCollector sc = new ShapeCollector();
            Square sq1 = new Square("Square", 3.5);
            Triangle tr1 = new Triangle("Triangle", 5.5);
            sc.addFigure(sq1);
            sc.addFigure(tr1);
            list.add(sq1);
            //When
            sc.removeFigure(tr1);
            //Then
            Assertions.assertEquals(sc.getShapeList(), list);
        }
    }
    @Nested
    @DisplayName("Test to show figures")
    class TestShowFigures {
        @Test
        void testShowFigures() {
            //Given
            ShapeCollector sc = new ShapeCollector();
            Square sq1 = new Square("Square", 3.5);
            List<Square> list = new ArrayList();
            list.add(sq1);

            //When
            sc.addFigure(sq1);

            //Then
            Assertions.assertEquals(sc.showFigures(), list);

        }
    }

    @Nested
    @DisplayName("Test to Get(i) Figure")
    class TestGetFigure {
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector sc = new ShapeCollector();
            Square sq1 = new Square("Square", 3.5);
            List<Square> list = new ArrayList();
            list.add(sq1);
            //When
            sc.addFigure(sq1);
            //Then
            Assertions.assertEquals(sc.getFigure(0), list.get(0));

        }
    }


}
