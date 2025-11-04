// BuilderDemo.java
// Demonstrates the Builder Design Pattern in Java.
// The Builder Pattern is used to construct complex objects step-by-step.
// It allows you to set only the fields you need while keeping the code readable and flexible.


// ---------------------- Product Class ----------------------
class Computer {
    // Step 1: Declare fields (product attributes)
    private String CPU;
    private int RAM;
    private int storage;
    private String graphicsCard;

    // Step 2: Private constructor — object can only be built via Builder
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
    }

    // ---------------------- Builder Class ----------------------
    // Step 3: Static nested Builder class
    public static class Builder {
        // Fields same as the outer class
        private String CPU;
        private int RAM;
        private int storage;
        private String graphicsCard;

        // Step 4: Setter-like methods that return the Builder itself (method chaining)
        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this; // Return current Builder object for chaining
        }

        public Builder setRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        // Step 5: Build method — creates the final Computer object
        public Computer build() {
            return new Computer(this);
        }
    }

    // Step 6: Method to display the computer’s specifications
    public void showSpecs() {
        System.out.println("CPU: " + CPU +
                ", RAM: " + RAM + "GB" +
                ", Storage: " + storage + "GB" +
                ", GPU: " + graphicsCard);
    }
}


// ---------------------- Client Code ----------------------
public class BuilderDemo {
    public static void main(String[] args) {
        // Step 7: Create a Gaming PC using method chaining
        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM(32)
                .setStorage(1000)
                .setGraphicsCard("RTX 4080")
                .build(); // Final object built here

        // Step 8: Create an Office PC with different configuration
        Computer officePC = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM(16)
                .setStorage(512)
                .setGraphicsCard("Integrated")
                .build();

        // Step 9: Display specifications for both PCs
        gamingPC.showSpecs();
        officePC.showSpecs();
    }
}
