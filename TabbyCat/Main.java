package TabbyCat;

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
