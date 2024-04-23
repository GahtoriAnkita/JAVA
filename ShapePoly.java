// Parent class
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

// Child class 1
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Child class 2
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class ShapePoly{
    public static void main(String[] args) {
        // Polymorphism example
        Shape shape1 = new Circle(); // Shape reference, Circle object
        Shape shape2 = new Rectangle(); // Shape reference, Rectangle object

        // Calls overridden method of Circle class
        shape1.draw(); // Output: Drawing a circle

        // Calls overridden method of Rectangle class
        shape2.draw(); // Output: Drawing a rectangle
    }
}
