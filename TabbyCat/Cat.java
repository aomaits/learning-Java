package TabbyCat;
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

//Class containing the main method to run the program
public class Main {
    public static void main(String[] args) {
        // Creating a new Cat object using the 'new' keyword
        Cat tabby = new Cat();

        // Calling the public methods of the Cat class
        tabby.meow(); // Output: Meow!
        tabby.scratch(); //Output: Scratch!

        // Demonstrating the reusability of methods
        tabby.displayBehavior(); // Calls multiple methods to display behaviors
    }
}