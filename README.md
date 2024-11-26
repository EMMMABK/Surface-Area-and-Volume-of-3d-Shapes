# 3D Shape Volume and Surface Area Calculator

## Description

This project uses polymorphism in Java through the utilization of an interface (`Shape3DInterface`) and different 3D shape classes (`Sphere`, `Cylinder`, `Cube`). Every shape will implement the `Shape3DInterface`, which includes methods to calculate the surface area and volume of a shape. The program outputs 10 random shapes along with their respective surface area and volume.

### Polymorphism in Action
Polymorphism is a core concept used in this project. By using the `Shape3DInterface`, we can store references to different types of 3D shapes (Sphere, Cylinder, Cube) in a single list. At runtime, Java uses dynamic method dispatch to invoke the appropriate `surfaceArea()` and `volume()` methods for each shape.

```
List<Shape3DInterface> shapes = new ArrayList<>();

// Adding objects of different types (Sphere, Cylinder, Cube)
shapes.add(new Sphere(5.0));     // A Sphere object is stored in a Shape3DInterface reference
shapes.add(new Cylinder(3.0, 10.0)); // A Cylinder object is stored in a Shape3DInterface reference
shapes.add(new Cube(4.0));       // A Cube object is stored in a Shape3DInterface reference

// Looping through the list and calling methods on different shape types
for (Shape3DInterface shape : shapes) {
    System.out.println(shape);  // This will call the overridden toString() method in each shape class
    System.out.println("Surface Area: " + shape.surfaceArea()); // Dynamic dispatch to the appropriate method
    System.out.println("Volume: " + shape.volume()); // Dynamic dispatch to the appropriate method
    System.out.println();
}

```

### Key Features
- **Random Shape Generation**: The program generates 10 random 3D shapes.
- **Polymorphism**: Different shapes (Sphere, Cylinder, Cube) implement the same interface and can be treated uniformly.
- **Surface Area and Volume Calculations**: For each shape, the program calculates and outputs the surface area and volume using specific formulas.

## Shape Formulas

- **Sphere**:
    - Surface Area: `4 * π * r^2`
    - Volume: `(4 / 3) * π * r^3`

- **Cylinder**:
    - Surface Area: `2 * π * r * (r + h)`
    - Volume: `π * r^2 * h`

- **Cube**:
    - Surface Area: `6 * a^2`
    - Volume: `a^3`

Where:
- `r` is the radius,
- `h` is the height,
- `a` is the side length.

## Example Output

```
Sphere [radius=4.25]
Surface Area: 226.98006922186255
Volume: 321.8370972152012

Cylinder [radius=3.75, height=10.57]
Surface Area: 334.87295370025586
Volume: 467.8275032801639

Cube [side=8.42]
Surface Area: 425.2932
Volume: 596.093048
```
![Screenshot](/assets/screenshot.png)

## Technologies Used
- Java 8 or higher
- Random class for generating random shape dimensions

## License
This project is licensed under the MIT License.
