package Cat;
public class Cat {
    // Using 'private' to restrict access to the properties from outside this class
    private String color;
    private String mood;

    // Public constructor for Cat class
    public Cat(String color, String mood) {
        // The 'this' keyword refers to the current instance of the class
        this.color = color;
        this.mood = mood;
    }

    // Public method to access the private color field
    public String getColor() {
        return color;
    }

    // Public method to access the private mood field
    public String getMood() {
        return mood;
    }

    // Private method, only accessible within this class
    private void changeMood(String newMood) {
        mood = newMood;
    }

    // Public method to expose the behavior of the Cat object
    public void purr() {
        System.out.println("Cat purrs");
    }

    // Public method to interact with the private changeMood method
    public void makeHappy() {
        changeMood("happy");
        purr(); // The cat purrs when made happy
    }
}
