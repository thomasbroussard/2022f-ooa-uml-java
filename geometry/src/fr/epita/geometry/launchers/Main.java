package fr.epita.geometry.launchers;

import fr.epita.geometry.datamodel.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle(2.0, 3.0, 4.0, 5.0);

        System.out.println("area of triangle :" + t.getArea());

    }
}
