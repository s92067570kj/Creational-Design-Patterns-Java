// PrototypeDemo.java
// Demonstrates the Prototype Design Pattern in Java.
// The Prototype Pattern is used to create object copies (clones)
// without directly instantiating classes with the 'new' keyword.


// ---------------------- Prototype Class ----------------------
class Document implements Cloneable {
    // Step 1: Fields of the Document class
    private String title;
    private String content;

    // Step 2: Constructor to initialize document details
    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // Step 3: Setter method to modify the content of the document
    public void setContent(String content) {
        this.content = content;
    }

    // Step 4: Method to display document information
    public void show() {
        System.out.println("Title: " + title + " | Content: " + content);
    }

    // Step 5: Overriding clone() to create a copy of the object
    @Override
    protected Document clone() {
        try {
            // Uses Object's clone() method to perform a shallow copy.
            // Works fine here because Strings are immutable in Java.
            return (Document) super.clone();
        } catch (CloneNotSupportedException e) {
            // In case the class doesn't implement Cloneable (but it does)
            return null;
        }
    }
}


// ---------------------- Client Code ----------------------
public class PrototypeDemo {
    public static void main(String[] args) {
        // Step 6: Create an original Document object
        Document original = new Document("Report", "This is the original document.");

        // Step 7: Clone the original document using the prototype (clone) method
        Document copy = original.clone();

        // Step 8: Modify the cloned document's content
        copy.setContent("This is the modified copy.");

        // Step 9: Show that the original and cloned documents are separate objects
        System.out.println("Original Document:");
        original.show();

        System.out.println("Cloned Document:");
        copy.show();
    }
}
