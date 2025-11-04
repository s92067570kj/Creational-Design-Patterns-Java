// Interface that defines the common behavior for all shapes
interface Shape {
    void draw(); // Abstract method that each shape must implement
}

// Concrete class implementing Shape interface
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle."); // Circle-specific behavior
    }
}

// Another concrete class implementing Shape interface
class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle."); // Rectangle-specific behavior
    }
}

// Another concrete class implementing Shape interface
class Square implements Shape {
    public void draw() {
        System.out.println("Drawing a Square."); // Square-specific behavior
    }
}

// Factory class responsible for creating shape objects
class ShapeFactory {
    // Method that returns a specific Shape object based on input string
    public Shape getShape(String shapeType) {
        if (shapeType == null) return null; // Handle null input

        // Convert input to lowercase and match with shape types
        switch (shapeType.toLowerCase()) {
            case "circle":
                return new Circle(); // Create and return Circle object
            case "rectangle":
                return new Rectangle(); // Create and return Rectangle object
            case "square":
                return new Square(); // Create and return Square object
            default:
                return null; // Return null for invalid shape type
        }
    }
}

// Main class to demonstrate the Factory Method pattern
public class FactoryMethodDemo {
    public static void main(String[] args) {
        // Create a factory object
        ShapeFactory factory = new ShapeFactory();

        // Use the factory to create different shapes
        Shape s1 = factory.getShape("circle");
        Shape s2 = factory.getShape("rectangle");
        Shape s3 = factory.getShape("square");

        // Call the draw() method on each shape object
        s1.draw();
        s2.draw();
        s3.draw();
    }
}
