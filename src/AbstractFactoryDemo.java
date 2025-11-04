// AbstractFactoryDemo.java
// Demonstrates the Abstract Factory Design Pattern in Java.
// The Abstract Factory Pattern provides an interface for creating families
// of related objects (like Buttons and Checkboxes) without specifying their concrete classes.

// ---------------------- Product Interfaces ----------------------
// Step 1: Define interfaces for the products.
interface Button {
    void paint(); // Method to draw/paint a button.
}

interface Checkbox {
    void check(); // Method to perform a check action.
}

// ---------------------- Light Theme Implementations ----------------------
// Step 2: Implement concrete classes for the "Light" theme.
class LightButton implements Button {
    public void paint() {
        System.out.println("Painting Light Button."); // Specific implementation for Light Button.
    }
}

class LightCheckbox implements Checkbox {
    public void check() {
        System.out.println("Checking Light Checkbox."); // Specific implementation for Light Checkbox.
    }
}

// ---------------------- Dark Theme Implementations ----------------------
// Step 3: Implement concrete classes for the "Dark" theme.
class DarkButton implements Button {
    public void paint() {
        System.out.println("Painting Dark Button."); // Specific implementation for Dark Button.
    }
}

class DarkCheckbox implements Checkbox {
    public void check() {
        System.out.println("Checking Dark Checkbox."); // Specific implementation for Dark Checkbox.
    }
}

// ---------------------- Abstract Factory Interface ----------------------
// Step 4: Define the abstract factory interface that declares methods for creating objects.
interface UIFactory {
    Button createButton();     // Creates a Button product.
    Checkbox createCheckbox(); // Creates a Checkbox product.
}

// ---------------------- Concrete Factory Implementations ----------------------
// Step 5: Implement factories for each theme family (Light & Dark).
class LightThemeFactory implements UIFactory {
    // Creates Light Theme components
    public Button createButton() { return new LightButton(); }
    public Checkbox createCheckbox() { return new LightCheckbox(); }
}

class DarkThemeFactory implements UIFactory {
    // Creates Dark Theme components
    public Button createButton() { return new DarkButton(); }
    public Checkbox createCheckbox() { return new DarkCheckbox(); }
}

// ---------------------- Client Code ----------------------
// Step 6: The main class acts as the client, selecting a factory at runtime.
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        String theme = "dark"; // Change this to "light" to switch theme.

        UIFactory factory;

        // Step 7: Decide which factory to use based on the theme.
        if (theme.equalsIgnoreCase("light")) {
            factory = new LightThemeFactory();
        } else {
            factory = new DarkThemeFactory();
        }

        // Step 8: Use the factory to create theme-specific UI components.
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        // Step 9: Use the created objects without worrying about their concrete classes.
        button.paint();
        checkbox.check();
    }
}
