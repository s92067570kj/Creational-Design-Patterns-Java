Creational Design Patterns in Java

This project demonstrates five major Creational Design Patterns, each implemented as an independent Java program.

🧩 1. Singleton Pattern

Purpose: Ensures only one instance of a class exists and provides a global access point to it.
Example: Logger or ThreadSafeSingleton.
✅ Use when a single shared resource (like a configuration manager or log file) is needed.

⚙️ 2. Factory Method Pattern

Purpose: Defines an interface for creating an object but allows subclasses to alter the type of objects created.
Example: ShapeFactory creating Circle, Rectangle, and Square.
✅ Use when you need to delegate object creation to subclasses.

🏗️ 3. Builder Pattern

Purpose: Simplifies object construction when there are many parameters.
Example: Computer.Builder to create custom PC configurations.
✅ Use when constructing complex objects step by step (e.g., configuration builders).

🧬 4. Prototype Pattern

Purpose: Creates new objects by copying existing ones (cloning).
Example: Document class implementing Cloneable.
✅ Use when object creation is costly, and cloning an existing instance is faster.

🎨 5. Abstract Factory Pattern

Purpose: Produces families of related objects without specifying their concrete classes.
Example: LightThemeFactory and DarkThemeFactory creating UI components.
✅ Use when a system must be independent of how its products are created or represented.