package Cat;

// To use the class, you would create an instance of Cat using the new keyword
public class Main {
    public static void main(String[] args) {
        // Creating a new Cat object with the 'new' keyword and the constructor
        Cat sleepyBlackCat = new Cat("black", "sleepy");

        // Accessing the public methods of the Cat class
        System.out.println("The cat is " + sleepyBlackCat.getColor() + " and feels " + sleepyBlackCat.getMood());
        sleepyBlackCat.makeHappy(); // Makes the cat happy which internally changes its mood and makes it purr
    }
}
