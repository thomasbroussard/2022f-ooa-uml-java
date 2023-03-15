package fr.epita.geometry.launchers;

import fr.epita.geometry.datamodel.Circle;
import fr.epita.geometry.datamodel.Shape;
import fr.epita.geometry.datamodel.Triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle(2.0, 3.0, 4.0, 5.0);
        Triangle t2 = new Triangle(2.0, 3.0, 4.0, 5.0);

        System.out.println("area of triangle :" + t.getArea());

        Circle c1 = new Circle(3.0);
        Circle c2 = new Circle(5.0);


        List<Object> shapesList = Arrays.asList(t, t2, c1, c2);
//        for (int i = 0; i< shapesList.size(); i ++){
//
//        }
        Double globalArea = 0.0;
        for(Object item: shapesList){
            Double itemArea = 0.0;
            if (item instanceof Triangle){
                itemArea = ((Triangle)item).getArea();
            } else if (item instanceof Circle) {
                itemArea = ((Circle) item).getArea();
            }
            globalArea += itemArea;
        }
        System.out.println("globalArea: " + globalArea);


        List<Shape> otherShapesList = Arrays.asList(t, t2, c1, c2);
        for(Shape shape: otherShapesList){
            globalArea += shape.getArea();
        }
    }
}
