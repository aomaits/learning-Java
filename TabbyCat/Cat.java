package TabbyCat;

// In the Cat class, void meow() and void scratch() are method signatures. Void indicates they don't return any value. Meow and scratch are the actions they perform. 


public class Cat {

    // A method with no return value (void) that represents the cat's action of meowing
    public void meow() {
        // Prints "Meow!" to the console when the method is called
        System.out.println("Meow!");
    }

    // A method with no return value (void) that represents the cat's action of scratching
    public void scratch() {
        // Prints "Scratch!" to the console when the method is called
        System.out.println("Scratch!");
    }

    // Example of a method that changes the internal state of the object
    // Here, we assume a mood property is part of the Cat class
    private void changeMood(String mood) {
        // This method is private and cannot be called from outside the Cat class
    }

    // Additional method to demonstrate calling other methods and reusability
    public void displayBehavior() {
        meow();  // The cat meows
        scratch(); // The cat scratches
        changeMood("curious"); // The cat's mood is changed internally
    }
}