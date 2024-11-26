package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Shape3DInterface> shapes = new ArrayList<>();

        // Generate 10 random shapes
        for (int i = 0; i < 10; i++) {
            int shapeType = random.nextInt(3); // 0: Sphere, 1: Cylinder, 2: Cube

            switch (shapeType) {
                case 0: // Sphere
                    double sphereRadius = 1 + random.nextDouble() * 9; // Radius between 1 and 10
                    shapes.add(new Sphere(sphereRadius));
                    break;
                case 1: // Cylinder
                    double cylinderRadius = 1 + random.nextDouble() * 9; // Radius between 1 and 10
                    double cylinderHeight = 5 + random.nextDouble() * 15; // Height between 5 and 20
                    shapes.add(new Cylinder(cylinderRadius, cylinderHeight));
                    break;
                case 2: // Cube
                    double cubeSide = 1 + random.nextDouble() * 9; // Side between 1 and 10
                    shapes.add(new Cube(cubeSide));
                    break;
            }
        }

        // Output information for each shape
        for (Shape3DInterface shape : shapes) {
            System.out.println(shape);
            System.out.println("Surface Area: " + shape.surfaceArea());
            System.out.println("Volume: " + shape.volume());
            System.out.println();
        }
    }
}
